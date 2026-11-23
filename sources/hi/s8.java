package hi;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ s8(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        boolean z10;
        cb cbVar;
        l9 l9Var;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 0;
        sa saVar = this.b;
        switch (i7) {
            case 0:
                n2 n2Var = saVar.s;
                n2Var.p = ((Float) obj).floatValue();
                n2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                c7 c7Var = saVar.L1;
                if (c7Var != null) {
                    org.telegram.messenger.g0.z2(c7Var.g0);
                    saVar.L1.g0 = bitmap;
                    p8 p8Var = saVar.r0;
                    if (p8Var != null) {
                        p8Var.U0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                c7 c7Var2 = (c7) obj;
                saVar.V(c7Var2, false);
                int i12 = saVar.c;
                fi.p6 R1 = np.u1(i12).R1();
                a0.h hVar = R1.e;
                int i13 = R1.a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.g;
                fi.o6 o6Var = new fi.o6(R1, c7Var2);
                boolean z11 = c7Var2.g;
                long j3 = o6Var.K;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(c7Var2.f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.b, false);
                }
                R1.d(j3, o6Var, R1.c, true);
                if (j3 != k10.i(i13).n) {
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
                        tL_peerStories.peer = np.u1(i13).B1(j3);
                        R1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        R1.R(j3);
                    }
                }
                o6Var.d();
                ls.f(i13).k(ls.y5, new Object[0]);
                if (c7Var2.c && !c7Var2.g) {
                    np.u1(i12).R1().w.b(c7Var2);
                }
                if (c7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(c7Var2.a).cancelRequest(c7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                x5 x5Var = (x5) obj;
                if (saVar.D0 != null) {
                    saVar.E0.setLink(x5Var == null ? null : x5Var.a);
                    fa faVar = saVar.B0;
                    if (faVar != null) {
                        faVar.c.a(saVar.E0.E ? saVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                c7 c7Var3 = saVar.L1;
                if (c7Var3 != null) {
                    c7Var3.I0 = num.intValue();
                    np.g1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                fi.b bVar = saVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(saVar.b, new bi.t(i10)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = saVar.r.getWidth();
                    layout.y = (int) (saVar.r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.cb cbVar2 = bbVar.a;
                    cbVar2.getWindow().setAttributes(cbVar2.b);
                }
                bbVar.setTouchable(true);
                new lc(bbVar, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.g0.R2(hd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.m6.Xc, 0, new r8(saVar, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (cbVar = saVar.a1) != null && cbVar.Q) {
                    cbVar.Q = false;
                    if (cbVar.F && cbVar.h == null) {
                        cbVar.H = true;
                        wa waVar = cbVar.a;
                        if (waVar != null) {
                            waVar.h1(true);
                        }
                    }
                }
                saVar.Y0.x(2, bool.booleanValue());
                saVar.Z0.clearAnimation();
                o10.n(saVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                gc gcVar = gc.w;
                if (gcVar != null && gcVar.a == 2) {
                    gcVar.l();
                    break;
                }
                break;
            case 7:
                saVar.k();
                saVar.l();
                saVar.h((Runnable) obj);
                break;
            case 8:
                v vVar = (v) obj;
                fa faVar2 = saVar.B0;
                saVar.A0 = vVar;
                faVar2.o(vVar);
                saVar.J0.setSelected(vVar);
                v9 v9Var = saVar.C0;
                if (v9Var != null) {
                    v9Var.recordHevc = !saVar.B0.j();
                }
                saVar.H0.setDrawable(new w(vVar, false));
                saVar.b0(saVar.I0, saVar.J0.e, true);
                saVar.P0.e(true, saVar.B0.j() ? saVar.B0.getFilledProgress() : 0.0f);
                g3 g3Var = saVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(saVar.B0.j());
                    saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                saVar.P = true;
                saVar.p(true);
                org.telegram.messenger.g0.h3(new h9((y10) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!saVar.Q1 && !saVar.R1) {
                    int intValue2 = num2.intValue();
                    saVar.P1 = intValue2;
                    saVar.p0.a(intValue2 == -1, true);
                    saVar.h0(saVar.P1 == 1 && !saVar.J0.e, true);
                    saVar.R0.a(num2.intValue());
                    d6 d6Var = saVar.P0;
                    boolean z12 = num2.intValue() == 1;
                    d6Var.o0 = -1.0f;
                    d6Var.p0 = z12;
                    d6Var.invalidate();
                    if (num2.intValue() == -1) {
                        v9 v9Var2 = saVar.C0;
                        if (v9Var2 != null && v9Var2.isDual()) {
                            saVar.C0.toggleDual();
                        }
                        l3 l3Var = saVar.m1;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = saVar.n1;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                        l3 l3Var3 = saVar.X0;
                        if (l3Var3 != null) {
                            l3Var3.f(true);
                        }
                        saVar.B0.o(null);
                        saVar.B0.c();
                        saVar.J0.setSelected((v) null);
                        v9 v9Var3 = saVar.C0;
                        if (v9Var3 != null) {
                            v9Var3.recordHevc = !saVar.B0.j();
                        }
                    }
                    saVar.J0.a(false, true);
                    saVar.l0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                d6 d6Var2 = saVar.P0;
                d6Var2.o0 = f10.floatValue();
                d6Var2.invalidate();
                saVar.P0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                saVar.P0.setAlpha(Utilities.l(f10.floatValue() + 1.0f));
                saVar.Q0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                saVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f));
                saVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                saVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                saVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f10.floatValue() < 0.0f) {
                    saVar.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (saVar.L1 != null) {
                    ia iaVar = saVar.d1;
                    if (!iaVar.O1) {
                        iaVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                saVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            saVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        saVar.t();
                                        saVar.G();
                                        u9 u9Var = saVar.w1;
                                        if (u9Var != null) {
                                            u9Var.O0(1);
                                            u9Var.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    saVar.k0(0, false, true);
                                    u9 u9Var2 = saVar.w1;
                                    if (u9Var2 != null) {
                                        u9Var2.O0(2);
                                        u9Var2.V1 = true;
                                        u9Var2.l0(true);
                                        saVar.w1.w0 = true;
                                        break;
                                    }
                                }
                            } else {
                                saVar.k0(0, false, true);
                                u9 u9Var3 = saVar.w1;
                                if (u9Var3 != null) {
                                    u9Var3.w0 = false;
                                    u9Var3.O0(0);
                                    u9Var3.A0(null, true);
                                    break;
                                }
                            }
                        } else {
                            saVar.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                FrameLayout frameLayout = saVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(saVar.h0 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + saVar.d1.getEditTextHeight())));
                }
                l9 l9Var2 = saVar.e1;
                if (l9Var2 != null) {
                    int i16 = -(org.telegram.messenger.g0.L(24.0f) + saVar.d1.getEditTextHeight());
                    l9Var2.setTranslationY(i16 - (saVar.a1 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f)));
                }
                gc gcVar2 = gc.w;
                if (gcVar2 != null && gcVar2.a == 2) {
                    gcVar2.l();
                }
                if (saVar.d1.p0 && (l9Var = saVar.e1) != null) {
                    l9Var.c(false, true);
                    break;
                }
                break;
            case 14:
                n8 n8Var = (n8) obj;
                c7 c7Var4 = saVar.L1;
                if (c7Var4 != null) {
                    c7Var4.E0 = n8Var;
                }
                ArrayList arrayList3 = saVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((c7) obj2).E0 = n8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                c7 c7Var5 = saVar.L1;
                if (c7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    c7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = saVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((c7) obj3).v0 = saVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                c7 c7Var6 = saVar.L1;
                if (c7Var6 != null) {
                    c7Var6.w0 = hashSet;
                    ArrayList arrayList5 = saVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((c7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                c7 c7Var7 = saVar.L1;
                if (c7Var7 != null) {
                    Bitmap bitmap3 = c7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    saVar.L1.g0 = bitmap2;
                    p8 p8Var2 = saVar.r0;
                    if (p8Var2 != null) {
                        p8Var2.U0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                saVar.z0 = (n8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                v6 v6Var = saVar.p0;
                saVar.y0 = inputPeer2;
                v6Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                v6 v6Var2 = saVar.p0;
                saVar.y0 = inputPeer3;
                v6Var2.set(inputPeer3);
                break;
            default:
                n2 n2Var2 = saVar.s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.o = floatValue;
                n2Var2.n = n2.f(floatValue);
                n2Var2.g();
                break;
        }
    }
}
