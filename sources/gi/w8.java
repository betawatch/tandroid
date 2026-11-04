package gi;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ w8(va vaVar, int i3) {
        this.a = i3;
        this.b = vaVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        boolean z10;
        fb fbVar;
        o9 o9Var;
        int i3 = this.a;
        int i10 = 2;
        int i11 = 0;
        va vaVar = this.b;
        switch (i3) {
            case 0:
                n2 n2Var = vaVar.s;
                n2Var.p = ((Float) obj).floatValue();
                n2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    org.telegram.messenger.g0.z2(f7Var.g0);
                    vaVar.L1.g0 = bitmap;
                    t8 t8Var = vaVar.r0;
                    if (t8Var != null) {
                        t8Var.T0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                f7 f7Var2 = (f7) obj;
                vaVar.V(f7Var2, false);
                int i12 = vaVar.c;
                ei.z6 P1 = hp.s1(i12).P1();
                a0.h hVar = P1.e;
                int i13 = P1.a;
                ArrayList arrayList = P1.h;
                ArrayList arrayList2 = P1.g;
                ei.y6 y6Var = new ei.y6(P1, f7Var2);
                boolean z11 = f7Var2.g;
                long j10 = y6Var.K;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(f7Var2.f), y6Var);
                } else {
                    P1.d(j10, y6Var, P1.b, false);
                }
                P1.d(j10, y6Var, P1.c, true);
                if (j10 != h10.i(i13).n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            z10 = false;
                        } else if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j10) {
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
                                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j10) {
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
                        tL_peerStories.peer = hp.s1(i13).z1(j10);
                        P1.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        P1.R(j10);
                    }
                }
                y6Var.d();
                hs.f(i13).k(hs.v5, new Object[0]);
                if (f7Var2.c && !f7Var2.g) {
                    hp.s1(i12).P1().w.b(f7Var2);
                }
                if (f7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(f7Var2.a).cancelRequest(f7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                a6 a6Var = (a6) obj;
                if (vaVar.D0 != null) {
                    vaVar.E0.setLink(a6Var == null ? null : a6Var.a);
                    ia iaVar = vaVar.B0;
                    if (iaVar != null) {
                        iaVar.c.a(vaVar.E0.E ? vaVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                f7 f7Var3 = vaVar.L1;
                if (f7Var3 != null) {
                    f7Var3.I0 = num.intValue();
                    hp.e1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                ei.b bVar = vaVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.va vaVar2 = new org.telegram.ui.Components.wa(vaVar.b, new ai.y(i10)).a;
                WindowManager.LayoutParams layout = vaVar2.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vaVar.r.getWidth();
                    layout.y = (int) (vaVar.r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.wa waVar = vaVar2.a;
                    waVar.getWindow().setAttributes(waVar.b);
                }
                vaVar2.setTouchable(true);
                new fc(vaVar2, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.g0.S2(bd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.k6.Uc, 0, new v8(vaVar, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (fbVar = vaVar.a1) != null && fbVar.Q) {
                    fbVar.Q = false;
                    if (fbVar.F && fbVar.h == null) {
                        fbVar.H = true;
                        za zaVar = fbVar.a;
                        if (zaVar != null) {
                            zaVar.M(true);
                        }
                    }
                }
                vaVar.Y0.x(2, bool.booleanValue());
                vaVar.Z0.clearAnimation();
                org.telegram.messenger.camera.q.k(vaVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                ac acVar = ac.w;
                if (acVar != null && acVar.a == 2) {
                    acVar.l();
                    break;
                }
                break;
            case 7:
                vaVar.k();
                vaVar.l();
                vaVar.h((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                ia iaVar2 = vaVar.B0;
                vaVar.A0 = tVar;
                iaVar2.o(tVar);
                vaVar.J0.setSelected(tVar);
                y9 y9Var = vaVar.C0;
                if (y9Var != null) {
                    y9Var.recordHevc = !vaVar.B0.j();
                }
                vaVar.H0.setDrawable(new u(tVar, false));
                vaVar.b0(vaVar.I0, vaVar.J0.e, true);
                vaVar.P0.e(true, vaVar.B0.j() ? vaVar.B0.getFilledProgress() : 0.0f);
                g3 g3Var = vaVar.N0;
                if (g3Var != null) {
                    g3Var.setMultipleOnClick(vaVar.B0.j());
                    vaVar.N0.setMaxCount(Math.min(10, t.b() - vaVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                vaVar.P = true;
                vaVar.p(true);
                org.telegram.messenger.g0.i3(new k9((u10) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!vaVar.Q1 && !vaVar.R1) {
                    int intValue2 = num2.intValue();
                    vaVar.P1 = intValue2;
                    vaVar.p0.a(intValue2 == -1, true);
                    vaVar.h0(vaVar.P1 == 1 && !vaVar.J0.e, true);
                    vaVar.R0.a(num2.intValue());
                    h6 h6Var = vaVar.P0;
                    boolean z12 = num2.intValue() == 1;
                    h6Var.o0 = -1.0f;
                    h6Var.p0 = z12;
                    h6Var.invalidate();
                    if (num2.intValue() == -1) {
                        y9 y9Var2 = vaVar.C0;
                        if (y9Var2 != null && y9Var2.isDual()) {
                            vaVar.C0.toggleDual();
                        }
                        l3 l3Var = vaVar.m1;
                        if (l3Var != null) {
                            l3Var.f(true);
                        }
                        l3 l3Var2 = vaVar.n1;
                        if (l3Var2 != null) {
                            l3Var2.f(true);
                        }
                        l3 l3Var3 = vaVar.X0;
                        if (l3Var3 != null) {
                            l3Var3.f(true);
                        }
                        vaVar.B0.o(null);
                        vaVar.B0.c();
                        vaVar.J0.setSelected((t) null);
                        y9 y9Var3 = vaVar.C0;
                        if (y9Var3 != null) {
                            y9Var3.recordHevc = !vaVar.B0.j();
                        }
                    }
                    vaVar.J0.a(false, true);
                    vaVar.l0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                h6 h6Var2 = vaVar.P0;
                h6Var2.o0 = f10.floatValue();
                h6Var2.invalidate();
                vaVar.P0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                vaVar.P0.setAlpha(Utilities.l(f10.floatValue() + 1.0f));
                vaVar.Q0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                vaVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f));
                vaVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                vaVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                vaVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f10.floatValue() < 0.0f) {
                    vaVar.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (vaVar.L1 != null) {
                    la laVar = vaVar.d1;
                    if (!laVar.O1) {
                        laVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                vaVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            vaVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        vaVar.t();
                                        vaVar.G();
                                        x9 x9Var = vaVar.w1;
                                        if (x9Var != null) {
                                            x9Var.O0(1);
                                            x9Var.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    vaVar.k0(0, false, true);
                                    x9 x9Var2 = vaVar.w1;
                                    if (x9Var2 != null) {
                                        x9Var2.O0(2);
                                        x9Var2.V1 = true;
                                        x9Var2.l0(true);
                                        vaVar.w1.w0 = true;
                                        break;
                                    }
                                }
                            } else {
                                vaVar.k0(0, false, true);
                                x9 x9Var3 = vaVar.w1;
                                if (x9Var3 != null) {
                                    x9Var3.w0 = false;
                                    x9Var3.O0(0);
                                    x9Var3.A0(null, true);
                                    break;
                                }
                            }
                        } else {
                            vaVar.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                FrameLayout frameLayout = vaVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(vaVar.h0 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + vaVar.d1.getEditTextHeight())));
                }
                o9 o9Var2 = vaVar.e1;
                if (o9Var2 != null) {
                    int i16 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.d1.getEditTextHeight());
                    o9Var2.setTranslationY(i16 - (vaVar.a1 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f)));
                }
                ac acVar2 = ac.w;
                if (acVar2 != null && acVar2.a == 2) {
                    acVar2.l();
                }
                if (vaVar.d1.p0 && (o9Var = vaVar.e1) != null) {
                    o9Var.c(false, true);
                    break;
                }
                break;
            case 14:
                r8 r8Var = (r8) obj;
                f7 f7Var4 = vaVar.L1;
                if (f7Var4 != null) {
                    f7Var4.E0 = r8Var;
                }
                ArrayList arrayList3 = vaVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((f7) obj2).E0 = r8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                f7 f7Var5 = vaVar.L1;
                if (f7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    f7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = vaVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((f7) obj3).v0 = vaVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                f7 f7Var6 = vaVar.L1;
                if (f7Var6 != null) {
                    f7Var6.w0 = hashSet;
                    ArrayList arrayList5 = vaVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((f7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                f7 f7Var7 = vaVar.L1;
                if (f7Var7 != null) {
                    Bitmap bitmap3 = f7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vaVar.L1.g0 = bitmap2;
                    t8 t8Var2 = vaVar.r0;
                    if (t8Var2 != null) {
                        t8Var2.T0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                vaVar.z0 = (r8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                y6 y6Var2 = vaVar.p0;
                vaVar.y0 = inputPeer2;
                y6Var2.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                y6 y6Var3 = vaVar.p0;
                vaVar.y0 = inputPeer3;
                y6Var3.set(inputPeer3);
                break;
            default:
                n2 n2Var2 = vaVar.s;
                float floatValue = ((Float) obj).floatValue();
                n2Var2.o = floatValue;
                n2Var2.n = n2.f(floatValue);
                n2Var2.g();
                break;
        }
    }
}
