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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ n9(nb nbVar, int i7) {
        this.a = i7;
        this.b = nbVar;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        boolean z10;
        xb xbVar;
        ga gaVar;
        int i7 = this.a;
        int i10 = 2;
        int i11 = 0;
        nb nbVar = this.b;
        switch (i7) {
            case 0:
                w2 w2Var = nbVar.s;
                w2Var.p = ((Float) obj).floatValue();
                w2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                x7 x7Var = nbVar.L1;
                if (x7Var != null) {
                    org.telegram.messenger.g0.z2(x7Var.g0);
                    nbVar.L1.g0 = bitmap;
                    k9 k9Var = nbVar.r0;
                    if (k9Var != null) {
                        k9Var.U0(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                x7 x7Var2 = (x7) obj;
                nbVar.V(x7Var2, false);
                int i12 = nbVar.c;
                fi.p6 R1 = mp.u1(i12).R1();
                a0.h hVar = R1.e;
                int i13 = R1.a;
                ArrayList arrayList = R1.h;
                ArrayList arrayList2 = R1.g;
                fi.o6 o6Var = new fi.o6(R1, x7Var2);
                boolean z11 = x7Var2.g;
                long j3 = o6Var.K;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(x7Var2.f), o6Var);
                } else {
                    R1.d(j3, o6Var, R1.b, false);
                }
                R1.d(j3, o6Var, R1.c, true);
                if (j3 != i10.i(i13).n) {
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
                if (x7Var2.c && !x7Var2.g) {
                    mp.u1(i12).R1().w.b(x7Var2);
                }
                if (x7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(x7Var2.a).cancelRequest(x7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                h6 h6Var = (h6) obj;
                if (nbVar.D0 != null) {
                    nbVar.E0.setLink(h6Var == null ? null : h6Var.a);
                    ab abVar = nbVar.B0;
                    if (abVar != null) {
                        abVar.c.a(nbVar.E0.E ? nbVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                x7 x7Var3 = nbVar.L1;
                if (x7Var3 != null) {
                    x7Var3.I0 = num.intValue();
                    mp.g1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                fi.b bVar = nbVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.ab abVar2 = new org.telegram.ui.Components.bb(nbVar.b, new bi.t(i10)).a;
                WindowManager.LayoutParams layout = abVar2.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = nbVar.r.getWidth();
                    layout.y = (int) (nbVar.r.getY() + org.telegram.messenger.g0.L(56.0f));
                    org.telegram.ui.Components.bb bbVar = abVar2.a;
                    bbVar.getWindow().setAttributes(bbVar.b);
                }
                abVar2.setTouchable(true);
                new org.telegram.ui.Components.kc(abVar2, bVar).G(R.raw.fire_on, 3, org.telegram.messenger.g0.R2(gd.G(intValue, "StoryPeriodPremium", new Object[0]), org.telegram.ui.ActionBar.n6.Xc, 0, new m9(nbVar, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (xbVar = nbVar.a1) != null && xbVar.Q) {
                    xbVar.Q = false;
                    if (xbVar.F && xbVar.h == null) {
                        xbVar.H = true;
                        rb rbVar = xbVar.a;
                        if (rbVar != null) {
                            rbVar.X(true);
                        }
                    }
                }
                nbVar.Y0.x(2, bool.booleanValue());
                nbVar.Z0.clearAnimation();
                m10.n(nbVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.w;
                if (fcVar != null && fcVar.a == 2) {
                    fcVar.l();
                    break;
                }
                break;
            case 7:
                nbVar.k();
                nbVar.l();
                nbVar.h((Runnable) obj);
                break;
            case 8:
                c0 c0Var = (c0) obj;
                ab abVar3 = nbVar.B0;
                nbVar.A0 = c0Var;
                abVar3.o(c0Var);
                nbVar.J0.setSelected(c0Var);
                qa qaVar = nbVar.C0;
                if (qaVar != null) {
                    qaVar.recordHevc = !nbVar.B0.j();
                }
                nbVar.H0.setDrawable(new d0(c0Var, false));
                nbVar.b0(nbVar.I0, nbVar.J0.e, true);
                nbVar.P0.e(true, nbVar.B0.j() ? nbVar.B0.getFilledProgress() : 0.0f);
                p3 p3Var = nbVar.N0;
                if (p3Var != null) {
                    p3Var.setMultipleOnClick(nbVar.B0.j());
                    nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                nbVar.P = true;
                nbVar.p(true);
                org.telegram.messenger.g0.h3(new ca((w10) obj, i11), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                if (!nbVar.Q1 && !nbVar.R1) {
                    int intValue2 = num2.intValue();
                    nbVar.P1 = intValue2;
                    nbVar.p0.a(intValue2 == -1, true);
                    nbVar.h0(nbVar.P1 == 1 && !nbVar.J0.e, true);
                    nbVar.R0.a(num2.intValue());
                    n6 n6Var = nbVar.P0;
                    boolean z12 = num2.intValue() == 1;
                    n6Var.o0 = -1.0f;
                    n6Var.p0 = z12;
                    n6Var.invalidate();
                    if (num2.intValue() == -1) {
                        qa qaVar2 = nbVar.C0;
                        if (qaVar2 != null && qaVar2.isDual()) {
                            nbVar.C0.toggleDual();
                        }
                        u3 u3Var = nbVar.m1;
                        if (u3Var != null) {
                            u3Var.f(true);
                        }
                        u3 u3Var2 = nbVar.n1;
                        if (u3Var2 != null) {
                            u3Var2.f(true);
                        }
                        u3 u3Var3 = nbVar.X0;
                        if (u3Var3 != null) {
                            u3Var3.f(true);
                        }
                        nbVar.B0.o(null);
                        nbVar.B0.c();
                        nbVar.J0.setSelected((c0) null);
                        qa qaVar3 = nbVar.C0;
                        if (qaVar3 != null) {
                            qaVar3.recordHevc = !nbVar.B0.j();
                        }
                    }
                    nbVar.J0.a(false, true);
                    nbVar.l0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                n6 n6Var2 = nbVar.P0;
                n6Var2.o0 = f10.floatValue();
                n6Var2.invalidate();
                nbVar.P0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                nbVar.P0.setAlpha(Utilities.l(f10.floatValue() + 1.0f));
                nbVar.Q0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                nbVar.Q0.setAlpha(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f));
                nbVar.Q0.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                nbVar.Q0.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f)));
                nbVar.Q0.setTranslationY(org.telegram.messenger.g0.W1(org.telegram.messenger.g0.z1(f10.floatValue(), 0.0f, -1.0f), org.telegram.messenger.g0.L(12.0f), 0));
                if (f10.floatValue() < 0.0f) {
                    nbVar.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                if (nbVar.L1 != null) {
                    db dbVar = nbVar.d1;
                    if (!dbVar.O1) {
                        dbVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                nbVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            nbVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        nbVar.t();
                                        nbVar.G();
                                        pa paVar = nbVar.w1;
                                        if (paVar != null) {
                                            paVar.R0(1);
                                            paVar.z0();
                                            break;
                                        }
                                    }
                                } else {
                                    nbVar.k0(0, false, true);
                                    pa paVar2 = nbVar.w1;
                                    if (paVar2 != null) {
                                        paVar2.R0(2);
                                        paVar2.Z1 = true;
                                        paVar2.n0(true);
                                        nbVar.w1.w0 = true;
                                        break;
                                    }
                                }
                            } else {
                                nbVar.k0(0, false, true);
                                pa paVar3 = nbVar.w1;
                                if (paVar3 != null) {
                                    paVar3.w0 = false;
                                    paVar3.R0(0);
                                    paVar3.C0();
                                    break;
                                }
                            }
                        } else {
                            nbVar.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                FrameLayout frameLayout = nbVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(nbVar.h0 == 2 ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(64.0f) + (-(org.telegram.messenger.g0.L(12.0f) + nbVar.d1.getEditTextHeight())));
                }
                ga gaVar2 = nbVar.e1;
                if (gaVar2 != null) {
                    int i16 = -(org.telegram.messenger.g0.L(24.0f) + nbVar.d1.getEditTextHeight());
                    gaVar2.setTranslationY(i16 - (nbVar.a1 == null ? 0 : r3.getContentHeight() - org.telegram.messenger.g0.L(5.0f)));
                }
                org.telegram.ui.Components.fc fcVar2 = org.telegram.ui.Components.fc.w;
                if (fcVar2 != null && fcVar2.a == 2) {
                    fcVar2.l();
                }
                if (nbVar.d1.p0 && (gaVar = nbVar.e1) != null) {
                    gaVar.c(false, true);
                    break;
                }
                break;
            case 14:
                i9 i9Var = (i9) obj;
                x7 x7Var4 = nbVar.L1;
                if (x7Var4 != null) {
                    x7Var4.E0 = i9Var;
                }
                ArrayList arrayList3 = nbVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        ((x7) obj2).E0 = i9Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                x7 x7Var5 = nbVar.L1;
                if (x7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    x7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = nbVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i11 < size2) {
                            Object obj3 = arrayList4.get(i11);
                            i11++;
                            ((x7) obj3).v0 = nbVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                x7 x7Var6 = nbVar.L1;
                if (x7Var6 != null) {
                    x7Var6.w0 = hashSet;
                    ArrayList arrayList5 = nbVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i11 < size3) {
                            Object obj4 = arrayList5.get(i11);
                            i11++;
                            ((x7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                x7 x7Var7 = nbVar.L1;
                if (x7Var7 != null) {
                    Bitmap bitmap3 = x7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    nbVar.L1.g0 = bitmap2;
                    k9 k9Var2 = nbVar.r0;
                    if (k9Var2 != null) {
                        k9Var2.U0(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                nbVar.z0 = (i9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                f7 f7Var = nbVar.p0;
                nbVar.y0 = inputPeer2;
                f7Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                f7 f7Var2 = nbVar.p0;
                nbVar.y0 = inputPeer3;
                f7Var2.set(inputPeer3);
                break;
            default:
                w2 w2Var2 = nbVar.s;
                float floatValue = ((Float) obj).floatValue();
                w2Var2.o = floatValue;
                w2Var2.n = w2.f(floatValue);
                w2Var2.g();
                break;
        }
    }
}
