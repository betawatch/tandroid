package hi;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ta b;

    public /* synthetic */ t8(ta taVar, int i7) {
        this.a = i7;
        this.b = taVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        boolean z10;
        db dbVar;
        m9 m9Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 0;
        ta taVar = this.b;
        switch (i7) {
            case 0:
                o2 o2Var = taVar.s;
                o2Var.p = ((Float) obj).floatValue();
                o2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                d7 d7Var = taVar.L1;
                if (d7Var != null) {
                    org.telegram.messenger.g0.z2(d7Var.g0);
                    taVar.L1.g0 = bitmap;
                    q8 q8Var = taVar.r0;
                    if (q8Var != null) {
                        q8Var.U0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                d7 d7Var2 = (d7) obj;
                taVar.V(d7Var2, false);
                int i12 = taVar.c;
                fi.p6 R1 = mp.u1(i12).R1();
                a0.h hVar = R1.e;
                int i13 = R1.a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.g;
                fi.o6 o6Var = new fi.o6(R1, d7Var2);
                boolean z11 = d7Var2.g;
                long j3 = o6Var.K;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(d7Var2.f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.b, false);
                }
                R1.d(j3, o6Var, R1.c, true);
                if (j3 != j10.i(i13).n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            z10 = false;
                        } else if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j3) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i14));
                            z10 = true;
                        } else {
                            i14++;
                        }
                    }
                    if (!z10) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                if (org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j3) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i15));
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = mp.u1(i13).B1(j3);
                        R1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        R1.R(j3);
                    }
                }
                o6Var.d();
                ks.f(i13).k(ks.y5, new Object[0]);
                if (d7Var2.c && !d7Var2.g) {
                    mp.u1(i12).R1().w.b(d7Var2);
                }
                if (d7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(d7Var2.a).cancelRequest(d7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                y5 y5Var = (y5) obj;
                if (taVar.D0 != null) {
                    taVar.E0.setLink(y5Var == null ? null : y5Var.a);
                    ga gaVar = taVar.B0;
                    if (gaVar != null) {
                        gaVar.c.a(taVar.E0.E ? taVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                d7 d7Var3 = taVar.L1;
                if (d7Var3 != null) {
                    d7Var3.I0 = num.intValue();
                    mp.g1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                fi.b bVar = taVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(taVar.b, new bi.t(i10)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = taVar.r.getWidth();
                    layout.y = (int) (taVar.r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.cb cbVar = bbVar.a;
                    cbVar.getWindow().setAttributes(cbVar.b);
                }
                bbVar.setTouchable(true);
                new lc(bbVar, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.g0.R2(gd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.n6.Xc, 0, new s8(taVar, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (dbVar = taVar.a1) != null && dbVar.Q) {
                    dbVar.Q = false;
                    if (dbVar.F && dbVar.h == null) {
                        dbVar.H = true;
                        xa xaVar = dbVar.a;
                        if (xaVar != null) {
                            xaVar.h1(true);
                        }
                    }
                }
                taVar.Y0.x(2, bool.booleanValue());
                taVar.Z0.clearAnimation();
                n10.n(taVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                gc gcVar = gc.w;
                if (gcVar != null && gcVar.a == 2) {
                    gcVar.l();
                    break;
                }
                break;
            case 7:
                taVar.k();
                taVar.l();
                taVar.h((Runnable) obj);
                break;
            case 8:
                u uVar = (u) obj;
                ga gaVar2 = taVar.B0;
                taVar.A0 = uVar;
                gaVar2.o(uVar);
                taVar.J0.setSelected(uVar);
                w9 w9Var = taVar.C0;
                if (w9Var != null) {
                    w9Var.recordHevc = !taVar.B0.j();
                }
                taVar.H0.setDrawable(new v(uVar, false));
                taVar.b0(taVar.I0, taVar.J0.e, true);
                taVar.P0.e(true, taVar.B0.j() ? taVar.B0.getFilledProgress() : 0.0f);
                h3 h3Var = taVar.N0;
                if (h3Var != null) {
                    h3Var.setMultipleOnClick(taVar.B0.j());
                    taVar.N0.setMaxCount(Math.min(10, u.b() - taVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                taVar.P = true;
                taVar.p(true);
                org.telegram.messenger.g0.h3(new i9((x10) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!taVar.Q1 && !taVar.R1) {
                    int intValue2 = num2.intValue();
                    taVar.P1 = intValue2;
                    taVar.p0.a(intValue2 == -1, true);
                    taVar.h0(taVar.P1 == 1 && !taVar.J0.e, true);
                    taVar.R0.a(num2.intValue());
                    e6 e6Var = taVar.P0;
                    boolean z12 = num2.intValue() == 1;
                    e6Var.o0 = -1.0f;
                    e6Var.p0 = z12;
                    e6Var.invalidate();
                    if (num2.intValue() == -1) {
                        w9 w9Var2 = taVar.C0;
                        if (w9Var2 != null && w9Var2.isDual()) {
                            taVar.C0.toggleDual();
                        }
                        m3 m3Var = taVar.m1;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = taVar.n1;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                        m3 m3Var3 = taVar.X0;
                        if (m3Var3 != null) {
                            m3Var3.f(true);
                        }
                        taVar.B0.o(null);
                        taVar.B0.c();
                        taVar.J0.setSelected((u) null);
                        w9 w9Var3 = taVar.C0;
                        if (w9Var3 != null) {
                            w9Var3.recordHevc = !taVar.B0.j();
                        }
                    }
                    taVar.J0.a(false, true);
                    taVar.l0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                e6 e6Var2 = taVar.P0;
                e6Var2.o0 = f10.floatValue();
                e6Var2.invalidate();
                taVar.P0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                taVar.P0.setAlpha(Utilities.l(f10.floatValue() + 1.0f));
                taVar.Q0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                taVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f));
                taVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                taVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                taVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f10.floatValue() < 0.0f) {
                    taVar.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (taVar.L1 != null) {
                    ja jaVar = taVar.d1;
                    if (!jaVar.O1) {
                        jaVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                taVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            taVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        taVar.t();
                                        taVar.G();
                                        v9 v9Var = taVar.w1;
                                        if (v9Var != null) {
                                            v9Var.O0(1);
                                            v9Var.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    taVar.k0(0, false, true);
                                    v9 v9Var2 = taVar.w1;
                                    if (v9Var2 != null) {
                                        v9Var2.O0(2);
                                        v9Var2.V1 = true;
                                        v9Var2.l0(true);
                                        taVar.w1.w0 = true;
                                        break;
                                    }
                                }
                            } else {
                                taVar.k0(0, false, true);
                                v9 v9Var3 = taVar.w1;
                                if (v9Var3 != null) {
                                    v9Var3.w0 = false;
                                    v9Var3.O0(0);
                                    v9Var3.A0(null, true);
                                    break;
                                }
                            }
                        } else {
                            taVar.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                FrameLayout frameLayout = taVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(taVar.h0 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + taVar.d1.getEditTextHeight())));
                }
                m9 m9Var2 = taVar.e1;
                if (m9Var2 != null) {
                    int i16 = -(org.telegram.messenger.g0.L(24.0f) + taVar.d1.getEditTextHeight());
                    m9Var2.setTranslationY(i16 - (taVar.a1 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f)));
                }
                gc gcVar2 = gc.w;
                if (gcVar2 != null && gcVar2.a == 2) {
                    gcVar2.l();
                }
                if (taVar.d1.p0 && (m9Var = taVar.e1) != null) {
                    m9Var.c(false, true);
                    break;
                }
                break;
            case 14:
                o8 o8Var = (o8) obj;
                d7 d7Var4 = taVar.L1;
                if (d7Var4 != null) {
                    d7Var4.E0 = o8Var;
                }
                ArrayList arrayList3 = taVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((d7) obj2).E0 = o8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                d7 d7Var5 = taVar.L1;
                if (d7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    d7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = taVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((d7) obj3).v0 = taVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                d7 d7Var6 = taVar.L1;
                if (d7Var6 != null) {
                    d7Var6.w0 = hashSet;
                    ArrayList arrayList5 = taVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((d7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                d7 d7Var7 = taVar.L1;
                if (d7Var7 != null) {
                    Bitmap bitmap3 = d7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    taVar.L1.g0 = bitmap2;
                    q8 q8Var2 = taVar.r0;
                    if (q8Var2 != null) {
                        q8Var2.U0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                taVar.z0 = (o8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                w6 w6Var = taVar.p0;
                taVar.y0 = inputPeer2;
                w6Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                w6 w6Var2 = taVar.p0;
                taVar.y0 = inputPeer3;
                w6Var2.set(inputPeer3);
                break;
            default:
                o2 o2Var2 = taVar.s;
                float floatValue = ((Float) obj).floatValue();
                o2Var2.o = floatValue;
                o2Var2.n = o2.f(floatValue);
                o2Var2.g();
                break;
        }
    }
}
