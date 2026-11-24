// default package

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8b implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ g8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // qac
    public final void a(Object obj) {
        boolean z;
        lqb lqbVar;
        r8b r8bVar;
        byte b = this.a;
        int i = 0;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                rk4 rk4Var = v9bVar.s;
                float floatValue = ((Float) obj).floatValue();
                rk4Var.o = floatValue;
                rk4Var.n = rk4.f(floatValue);
                rk4Var.g();
                break;
            case 1:
                rk4 rk4Var2 = v9bVar.s;
                rk4Var2.p = ((Float) obj).floatValue();
                rk4Var2.i();
                break;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                g6b g6bVar = v9bVar.L1;
                if (g6bVar != null) {
                    gm.w2(g6bVar.g0);
                    v9bVar.L1.g0 = bitmap;
                    a8b a8bVar = v9bVar.r0;
                    if (a8bVar != null) {
                        a8bVar.O0(bitmap);
                        break;
                    }
                }
                break;
            case 3:
                g6b g6bVar2 = (g6b) obj;
                v9bVar.V(g6bVar2, false);
                int i2 = v9bVar.c;
                h4b N1 = oc7.r1(i2).N1();
                vh6 vh6Var = N1.e;
                int i3 = N1.a;
                ArrayList arrayList = N1.h;
                ArrayList arrayList2 = N1.g;
                g4b g4bVar = new g4b(N1, g6bVar2);
                boolean z2 = g6bVar2.g;
                long j = g4bVar.K;
                if (z2) {
                    HashMap hashMap = (HashMap) vh6Var.f(j);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        vh6Var.k(hashMap, j);
                    }
                    hashMap.put(Integer.valueOf(g6bVar2.f), g4bVar);
                } else {
                    N1.c(j, g4bVar, N1.b, false);
                }
                N1.c(j, g4bVar, N1.c, true);
                if (j != z8c.h(i3).n) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            z = false;
                        } else if (pg3.n(((TL_stories.PeerStories) arrayList2.get(i4)).peer) == j) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i4));
                            z = true;
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < arrayList.size()) {
                                if (pg3.n(((TL_stories.PeerStories) arrayList.get(i5)).peer) == j) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i5));
                                    z = true;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    if (!z) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = oc7.r1(i3).x1(j);
                        N1.d0(j, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        N1.Q(j);
                    }
                }
                g4bVar.d();
                nm7.f(i3).k(nm7.z5, new Object[0]);
                if (g6bVar2.c && !g6bVar2.g) {
                    oc7.r1(i2).N1().w.b(g6bVar2);
                }
                if (g6bVar2.e1 != 0) {
                    ConnectionsManager.getInstance(g6bVar2.a).cancelRequest(g6bVar2.e1, true);
                    break;
                }
                break;
            case 4:
                cx8 cx8Var = (cx8) obj;
                if (v9bVar.D0 != null) {
                    v9bVar.E0.setLink(cx8Var == null ? null : cx8Var.a);
                    j9b j9bVar = v9bVar.B0;
                    if (j9bVar != null) {
                        j9bVar.c.c(v9bVar.E0.E ? (cx8) v9bVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                g6b g6bVar3 = v9bVar.L1;
                if (g6bVar3 != null) {
                    g6bVar3.I0 = num.intValue();
                    oc7.d1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 6:
                r63 r63Var = v9bVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                m21 m21Var = new n21(v9bVar.b, new oz((byte) 14)).a;
                WindowManager.LayoutParams layout = m21Var.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = v9bVar.r.getWidth();
                    layout.y = (int) (v9bVar.r.getY() + gm.L(56.0f));
                    n21 n21Var = m21Var.a;
                    n21Var.getWindow().setAttributes(n21Var.b);
                }
                m21Var.setTouchable(true);
                new c41(m21Var, r63Var).G(R.raw.fire_on, 3, gm.N2(jb6.G(intValue, "StoryPeriodPremium", new Object[0]), cmb.Wc, 0, new f8b(v9bVar, (byte) 28), r63Var)).k(true);
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (lqbVar = v9bVar.a1) != null && lqbVar.Q) {
                    lqbVar.Q = false;
                    if (lqbVar.F && lqbVar.h == null) {
                        lqbVar.H = true;
                        fqb fqbVar = lqbVar.a;
                        if (fqbVar != null) {
                            fqbVar.h1(true);
                        }
                    }
                }
                v9bVar.Y0.x(2, bool.booleanValue());
                v9bVar.Z0.clearAnimation();
                wi8.s(v9bVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                u31 u31Var = u31.x;
                if (u31Var != null && u31Var.a == 2) {
                    u31Var.l();
                    break;
                }
                break;
            case 8:
                v9bVar.i();
                v9bVar.j();
                v9bVar.f((Runnable) obj);
                break;
            case 9:
                sl2 sl2Var = (sl2) obj;
                j9b j9bVar2 = v9bVar.B0;
                v9bVar.A0 = sl2Var;
                j9bVar2.o(sl2Var);
                v9bVar.J0.setSelected(sl2Var);
                a9b a9bVar = v9bVar.C0;
                if (a9bVar != null) {
                    a9bVar.recordHevc = !v9bVar.B0.i();
                }
                v9bVar.H0.setDrawable(new tl2(sl2Var, false));
                v9bVar.b0(v9bVar.I0, v9bVar.J0.e, true);
                v9bVar.P0.e(true, v9bVar.B0.i() ? v9bVar.B0.getFilledProgress() : 0.0f);
                wt4 wt4Var = v9bVar.N0;
                if (wt4Var != null) {
                    wt4Var.setMultipleOnClick(v9bVar.B0.i());
                    v9bVar.N0.setMaxCount(Math.min(10, sl2.b() - v9bVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 10:
                v9bVar.P = true;
                v9bVar.o(true);
                gm.d3(new mo0((qac) obj, (byte) 13), 210L);
                break;
            case 11:
                Integer num2 = (Integer) obj;
                if (!v9bVar.Q1 && !v9bVar.R1) {
                    int intValue2 = num2.intValue();
                    v9bVar.P1 = intValue2;
                    v9bVar.p0.a(intValue2 == -1, true);
                    v9bVar.h0(v9bVar.P1 == 1 && !v9bVar.J0.e, true);
                    v9bVar.R0.a(num2.intValue());
                    j49 j49Var = v9bVar.P0;
                    boolean z3 = num2.intValue() == 1;
                    j49Var.o0 = -1.0f;
                    j49Var.p0 = z3;
                    j49Var.invalidate();
                    if (num2.intValue() == -1) {
                        a9b a9bVar2 = v9bVar.C0;
                        if (a9bVar2 != null && a9bVar2.isDual()) {
                            v9bVar.C0.toggleDual();
                        }
                        hg5 hg5Var = v9bVar.m1;
                        if (hg5Var != null) {
                            hg5Var.f(true);
                        }
                        hg5 hg5Var2 = v9bVar.n1;
                        if (hg5Var2 != null) {
                            hg5Var2.f(true);
                        }
                        hg5 hg5Var3 = v9bVar.X0;
                        if (hg5Var3 != null) {
                            hg5Var3.f(true);
                        }
                        v9bVar.B0.o(null);
                        v9bVar.B0.b();
                        v9bVar.J0.setSelected((sl2) null);
                        a9b a9bVar3 = v9bVar.C0;
                        if (a9bVar3 != null) {
                            a9bVar3.recordHevc = !v9bVar.B0.i();
                        }
                    }
                    v9bVar.J0.a(false, true);
                    v9bVar.l0(true);
                    break;
                }
                break;
            case 12:
                Float f = (Float) obj;
                j49 j49Var2 = v9bVar.P0;
                j49Var2.o0 = f.floatValue();
                j49Var2.invalidate();
                v9bVar.P0.setVisibility(f.floatValue() <= -1.0f ? 8 : 0);
                v9bVar.P0.setAlpha(Utilities.l(f.floatValue() + 1.0f));
                v9bVar.Q0.setVisibility(f.floatValue() < 0.0f ? 0 : 8);
                v9bVar.Q0.setAlpha(gm.x1(f.floatValue(), 0.0f, -1.0f));
                v9bVar.Q0.setScaleX(gm.R1(0.8f, 1.0f, gm.x1(f.floatValue(), 0.0f, -1.0f)));
                v9bVar.Q0.setScaleY(gm.R1(0.8f, 1.0f, gm.x1(f.floatValue(), 0.0f, -1.0f)));
                v9bVar.Q0.setTranslationY(gm.U1(gm.x1(f.floatValue(), 0.0f, -1.0f), gm.L(12.0f), 0));
                if (f.floatValue() < 0.0f) {
                    v9bVar.c(false);
                    break;
                }
                break;
            case 13:
                Integer num3 = (Integer) obj;
                if (v9bVar.L1 != null) {
                    l9b l9bVar = v9bVar.d1;
                    if (!l9bVar.O1) {
                        l9bVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                v9bVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            v9bVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        v9bVar.s();
                                        v9bVar.F();
                                        z8b z8bVar = v9bVar.w1;
                                        if (z8bVar != null) {
                                            z8bVar.R0(1);
                                            z8bVar.z0();
                                            break;
                                        }
                                    }
                                } else {
                                    v9bVar.k0(0, false, true);
                                    z8b z8bVar2 = v9bVar.w1;
                                    if (z8bVar2 != null) {
                                        z8bVar2.R0(2);
                                        z8bVar2.f2 = true;
                                        z8bVar2.l0(true);
                                        v9bVar.w1.C0 = true;
                                        break;
                                    }
                                }
                            } else {
                                v9bVar.k0(0, false, true);
                                z8b z8bVar3 = v9bVar.w1;
                                if (z8bVar3 != null) {
                                    z8bVar3.C0 = false;
                                    z8bVar3.R0(0);
                                    z8bVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            v9bVar.W();
                            break;
                        }
                    }
                }
                break;
            case 14:
                FrameLayout frameLayout = v9bVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(v9bVar.h0 == 2 ? gm.L(68.0f) : gm.L(64.0f) + (-(gm.L(12.0f) + v9bVar.d1.getEditTextHeight())));
                }
                r8b r8bVar2 = v9bVar.e1;
                if (r8bVar2 != null) {
                    int i6 = -(gm.L(24.0f) + v9bVar.d1.getEditTextHeight());
                    r8bVar2.setTranslationY(i6 - (v9bVar.a1 == null ? 0 : r1.getContentHeight() - gm.L(5.0f)));
                }
                u31 u31Var2 = u31.x;
                if (u31Var2 != null && u31Var2.a == 2) {
                    u31Var2.l();
                }
                if (v9bVar.d1.p0 && (r8bVar = v9bVar.e1) != null) {
                    r8bVar.c(false, true);
                    break;
                }
                break;
            case 15:
                y7b y7bVar = (y7b) obj;
                g6b g6bVar4 = v9bVar.L1;
                if (g6bVar4 != null) {
                    g6bVar4.E0 = y7bVar;
                }
                ArrayList arrayList3 = v9bVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        ((g6b) obj2).E0 = y7bVar;
                    }
                    break;
                }
                break;
            case 16:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                g6b g6bVar5 = v9bVar.L1;
                if (g6bVar5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    g6bVar5.v0 = inputPeer;
                    ArrayList arrayList4 = v9bVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i < size2) {
                            Object obj3 = arrayList4.get(i);
                            i++;
                            ((g6b) obj3).v0 = v9bVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 17:
                HashSet hashSet = (HashSet) obj;
                g6b g6bVar6 = v9bVar.L1;
                if (g6bVar6 != null) {
                    g6bVar6.w0 = hashSet;
                    ArrayList arrayList5 = v9bVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i < size3) {
                            Object obj4 = arrayList5.get(i);
                            i++;
                            ((g6b) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 18:
                Bitmap bitmap2 = (Bitmap) obj;
                g6b g6bVar7 = v9bVar.L1;
                if (g6bVar7 != null) {
                    Bitmap bitmap3 = g6bVar7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    v9bVar.L1.g0 = bitmap2;
                    a8b a8bVar2 = v9bVar.r0;
                    if (a8bVar2 != null) {
                        a8bVar2.O0(bitmap2);
                        break;
                    }
                }
                break;
            case 19:
                v9bVar.z0 = (y7b) obj;
                break;
            case 20:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                q0a q0aVar = v9bVar.p0;
                v9bVar.y0 = inputPeer2;
                q0aVar.set(inputPeer2);
                break;
            default:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                q0a q0aVar2 = v9bVar.p0;
                v9bVar.y0 = inputPeer3;
                q0aVar2.set(inputPeer3);
                break;
        }
    }
}
