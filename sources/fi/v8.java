package fi;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;

    public /* synthetic */ v8(va vaVar, int i7) {
        this.a = i7;
        this.b = vaVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        boolean z9;
        fb fbVar;
        o9 o9Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        va vaVar = this.b;
        switch (i7) {
            case 0:
                p2 p2Var = vaVar.s;
                p2Var.p = ((Float) obj).floatValue();
                p2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                e7 e7Var = vaVar.K1;
                if (e7Var != null) {
                    org.telegram.messenger.g0.z2(e7Var.g0);
                    vaVar.K1.g0 = bitmap;
                    s8 s8Var = vaVar.q0;
                    if (s8Var != null) {
                        s8Var.T0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                e7 e7Var2 = (e7) obj;
                vaVar.V(e7Var2, false);
                int i12 = vaVar.c;
                di.y6 P1 = qp.s1(i12).P1();
                a0.h hVar = P1.e;
                int i13 = P1.a;
                ArrayList arrayList = P1.h;
                ArrayList arrayList2 = P1.g;
                di.x6 x6Var = new di.x6(P1, e7Var2);
                boolean z10 = e7Var2.g;
                long j3 = x6Var.J;
                if (z10) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(e7Var2.f), x6Var);
                } else {
                    P1.d(j3, x6Var, P1.b, false);
                }
                P1.d(j3, x6Var, P1.c, true);
                if (j3 != p10.i(i13).n) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            z9 = false;
                        } else if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i14)).peer) == j3) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i14));
                            z9 = true;
                        } else {
                            i14++;
                        }
                    }
                    if (!z9) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < arrayList.size()) {
                                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i15)).peer) == j3) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i15));
                                    z9 = true;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    if (!z9) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = qp.s1(i13).z1(j3);
                        P1.e0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        P1.R(j3);
                    }
                }
                x6Var.d();
                qs.f(i13).k(qs.v5, new Object[0]);
                if (e7Var2.c && !e7Var2.g) {
                    qp.s1(i12).P1().w.b(e7Var2);
                }
                if (e7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(e7Var2.a).cancelRequest(e7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                a6 a6Var = (a6) obj;
                if (vaVar.C0 != null) {
                    vaVar.D0.setLink(a6Var == null ? null : a6Var.a);
                    ia iaVar = vaVar.A0;
                    if (iaVar != null) {
                        iaVar.c.a(vaVar.D0.D ? vaVar.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                e7 e7Var3 = vaVar.K1;
                if (e7Var3 != null) {
                    e7Var3.I0 = num.intValue();
                    qp.e1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                di.b bVar = vaVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.wa waVar = new org.telegram.ui.Components.xa(vaVar.b, new r7(i10)).a;
                WindowManager.LayoutParams layout = waVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vaVar.r.getWidth();
                    layout.y = (int) (vaVar.r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.xa xaVar = waVar.a;
                    xaVar.getWindow().setAttributes(xaVar.b);
                }
                waVar.setTouchable(true);
                new hc(waVar, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.g0.S2(hd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.k6.Uc, 0, new u8(vaVar, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (fbVar = vaVar.Z0) != null && fbVar.P) {
                    fbVar.P = false;
                    if (fbVar.E && fbVar.h == null) {
                        fbVar.G = true;
                        za zaVar = fbVar.a;
                        if (zaVar != null) {
                            zaVar.K(true);
                        }
                    }
                }
                vaVar.X0.x(2, bool.booleanValue());
                vaVar.Y0.clearAnimation();
                org.telegram.messenger.camera.q.k(vaVar.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                cc ccVar = cc.w;
                if (ccVar != null && ccVar.a == 2) {
                    ccVar.l();
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
                ia iaVar2 = vaVar.A0;
                vaVar.z0 = tVar;
                iaVar2.o(tVar);
                vaVar.I0.setSelected(tVar);
                y9 y9Var = vaVar.B0;
                if (y9Var != null) {
                    y9Var.recordHevc = !vaVar.A0.j();
                }
                vaVar.G0.setDrawable(new u(tVar, false));
                vaVar.b0(vaVar.H0, vaVar.I0.e, true);
                vaVar.O0.e(true, vaVar.A0.j() ? vaVar.A0.getFilledProgress() : 0.0f);
                i3 i3Var = vaVar.M0;
                if (i3Var != null) {
                    i3Var.setMultipleOnClick(vaVar.A0.j());
                    vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                vaVar.O = true;
                vaVar.p(true);
                org.telegram.messenger.g0.i3(new k9((c20) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!vaVar.P1 && !vaVar.Q1) {
                    int intValue2 = num2.intValue();
                    vaVar.O1 = intValue2;
                    vaVar.o0.a(intValue2 == -1, true);
                    vaVar.h0(vaVar.O1 == 1 && !vaVar.I0.e, true);
                    vaVar.Q0.a(num2.intValue());
                    g6 g6Var = vaVar.O0;
                    boolean z11 = num2.intValue() == 1;
                    g6Var.n0 = -1.0f;
                    g6Var.o0 = z11;
                    g6Var.invalidate();
                    if (num2.intValue() == -1) {
                        y9 y9Var2 = vaVar.B0;
                        if (y9Var2 != null && y9Var2.isDual()) {
                            vaVar.B0.toggleDual();
                        }
                        m3 m3Var = vaVar.l1;
                        if (m3Var != null) {
                            m3Var.f(true);
                        }
                        m3 m3Var2 = vaVar.m1;
                        if (m3Var2 != null) {
                            m3Var2.f(true);
                        }
                        m3 m3Var3 = vaVar.W0;
                        if (m3Var3 != null) {
                            m3Var3.f(true);
                        }
                        vaVar.A0.o(null);
                        vaVar.A0.c();
                        vaVar.I0.setSelected((t) null);
                        y9 y9Var3 = vaVar.B0;
                        if (y9Var3 != null) {
                            y9Var3.recordHevc = !vaVar.A0.j();
                        }
                    }
                    vaVar.I0.a(false, true);
                    vaVar.l0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                g6 g6Var2 = vaVar.O0;
                g6Var2.n0 = f10.floatValue();
                g6Var2.invalidate();
                vaVar.O0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                vaVar.O0.setAlpha(Utilities.l(f10.floatValue() + 1.0f));
                vaVar.P0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                vaVar.P0.setAlpha(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f));
                vaVar.P0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                vaVar.P0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                vaVar.P0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f10.floatValue() < 0.0f) {
                    vaVar.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (vaVar.K1 != null) {
                    la laVar = vaVar.c1;
                    if (!laVar.N1) {
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
                                        x9 x9Var = vaVar.v1;
                                        if (x9Var != null) {
                                            x9Var.O0(1);
                                            x9Var.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    vaVar.k0(0, false, true);
                                    x9 x9Var2 = vaVar.v1;
                                    if (x9Var2 != null) {
                                        x9Var2.O0(2);
                                        x9Var2.U1 = true;
                                        x9Var2.l0(true);
                                        vaVar.v1.v0 = true;
                                        break;
                                    }
                                }
                            } else {
                                vaVar.k0(0, false, true);
                                x9 x9Var3 = vaVar.v1;
                                if (x9Var3 != null) {
                                    x9Var3.v0 = false;
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
                FrameLayout frameLayout = vaVar.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(vaVar.g0 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + vaVar.c1.getEditTextHeight())));
                }
                o9 o9Var2 = vaVar.d1;
                if (o9Var2 != null) {
                    int i16 = -(org.telegram.messenger.g0.L(24.0f) + vaVar.c1.getEditTextHeight());
                    o9Var2.setTranslationY(i16 - (vaVar.Z0 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f)));
                }
                cc ccVar2 = cc.w;
                if (ccVar2 != null && ccVar2.a == 2) {
                    ccVar2.l();
                }
                if (vaVar.c1.o0 && (o9Var = vaVar.d1) != null) {
                    o9Var.c(false, true);
                    break;
                }
                break;
            case 14:
                q8 q8Var = (q8) obj;
                e7 e7Var4 = vaVar.K1;
                if (e7Var4 != null) {
                    e7Var4.E0 = q8Var;
                }
                ArrayList arrayList3 = vaVar.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((e7) obj2).E0 = q8Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                e7 e7Var5 = vaVar.K1;
                if (e7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    e7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = vaVar.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((e7) obj3).v0 = vaVar.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                e7 e7Var6 = vaVar.K1;
                if (e7Var6 != null) {
                    e7Var6.w0 = hashSet;
                    ArrayList arrayList5 = vaVar.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((e7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                e7 e7Var7 = vaVar.K1;
                if (e7Var7 != null) {
                    Bitmap bitmap3 = e7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vaVar.K1.g0 = bitmap2;
                    s8 s8Var2 = vaVar.q0;
                    if (s8Var2 != null) {
                        s8Var2.T0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                vaVar.y0 = (q8) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                x6 x6Var2 = vaVar.o0;
                vaVar.x0 = inputPeer2;
                x6Var2.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                x6 x6Var3 = vaVar.o0;
                vaVar.x0 = inputPeer3;
                x6Var3.set(inputPeer3);
                break;
            default:
                p2 p2Var2 = vaVar.s;
                float floatValue = ((Float) obj).floatValue();
                p2Var2.o = floatValue;
                p2Var2.n = p2.f(floatValue);
                p2Var2.g();
                break;
        }
    }
}
