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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6b implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t7b b;

    public /* synthetic */ e6b(t7b t7bVar, byte b) {
        this.a = b;
        this.b = t7bVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        boolean z;
        kob kobVar;
        p6b p6bVar;
        byte b = this.a;
        int i = 0;
        t7b t7bVar = this.b;
        switch (b) {
            case 0:
                mi4 mi4Var = t7bVar.s;
                float floatValue = ((Float) obj).floatValue();
                mi4Var.o = floatValue;
                mi4Var.n = mi4.f(floatValue);
                mi4Var.g();
                break;
            case 1:
                mi4 mi4Var2 = t7bVar.s;
                mi4Var2.p = ((Float) obj).floatValue();
                mi4Var2.i();
                break;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                f4b f4bVar = t7bVar.L1;
                if (f4bVar != null) {
                    gl.w2(f4bVar.g0);
                    t7bVar.L1.g0 = bitmap;
                    y5b y5bVar = t7bVar.r0;
                    if (y5bVar != null) {
                        y5bVar.O0(bitmap);
                        break;
                    }
                }
                break;
            case 3:
                f4b f4bVar2 = (f4b) obj;
                t7bVar.V(f4bVar2, false);
                int i2 = t7bVar.c;
                g2b M1 = na7.q1(i2).M1();
                vf6 vf6Var = M1.e;
                int i3 = M1.a;
                ArrayList arrayList = M1.h;
                ArrayList arrayList2 = M1.g;
                f2b f2bVar = new f2b(M1, f4bVar2);
                boolean z2 = f4bVar2.g;
                long j = f2bVar.K;
                if (z2) {
                    HashMap hashMap = (HashMap) vf6Var.f(j);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        vf6Var.k(hashMap, j);
                    }
                    hashMap.put(Integer.valueOf(f4bVar2.f), f2bVar);
                } else {
                    M1.c(j, f2bVar, M1.b, false);
                }
                M1.c(j, f2bVar, M1.c, true);
                if (j != y6c.h(i3).n) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            z = false;
                        } else if (cf3.n(((TL_stories.PeerStories) arrayList2.get(i4)).peer) == j) {
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
                                if (cf3.n(((TL_stories.PeerStories) arrayList.get(i5)).peer) == j) {
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
                        tL_peerStories.peer = na7.q1(i3).w1(j);
                        M1.d0(j, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        M1.Q(j);
                    }
                }
                f2bVar.d();
                kk7.f(i3).k(kk7.x5, new Object[0]);
                if (f4bVar2.c && !f4bVar2.g) {
                    na7.q1(i2).M1().w.b(f4bVar2);
                }
                if (f4bVar2.e1 != 0) {
                    ConnectionsManager.getInstance(f4bVar2.a).cancelRequest(f4bVar2.e1, true);
                    break;
                }
                break;
            case 4:
                bv8 bv8Var = (bv8) obj;
                if (t7bVar.D0 != null) {
                    t7bVar.E0.setLink(bv8Var == null ? null : bv8Var.a);
                    h7b h7bVar = t7bVar.B0;
                    if (h7bVar != null) {
                        h7bVar.c.c(t7bVar.E0.E ? (bv8) t7bVar.D0.d : null);
                        break;
                    }
                }
                break;
            case 5:
                Integer num = (Integer) obj;
                f4b f4bVar3 = t7bVar.L1;
                if (f4bVar3 != null) {
                    f4bVar3.I0 = num.intValue();
                    na7.c1().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 6:
                f53 f53Var = t7bVar.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                e11 e11Var = new f11(t7bVar.b, new oy((byte) 14)).a;
                WindowManager.LayoutParams layout = e11Var.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = t7bVar.r.getWidth();
                    layout.y = (int) (t7bVar.r.getY() + gl.L(56.0f));
                    f11 f11Var = e11Var.a;
                    f11Var.getWindow().setAttributes(f11Var.b);
                }
                e11Var.setTouchable(true);
                new u21(e11Var, f53Var).G(R.raw.fire_on, 3, gl.O2(k96.G(intValue, "StoryPeriodPremium", new Object[0]), bkb.Wc, 0, new d6b(t7bVar, (byte) 28), f53Var)).k(true);
                break;
            case 7:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && (kobVar = t7bVar.a1) != null && kobVar.Q) {
                    kobVar.Q = false;
                    if (kobVar.F && kobVar.h == null) {
                        kobVar.H = true;
                        eob eobVar = kobVar.a;
                        if (eobVar != null) {
                            eobVar.Q0(true);
                        }
                    }
                }
                t7bVar.Y0.x(2, bool.booleanValue());
                t7bVar.Z0.clearAnimation();
                ug8.s(t7bVar.Z0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                m21 m21Var = m21.w;
                if (m21Var != null && m21Var.a == 2) {
                    m21Var.l();
                    break;
                }
                break;
            case 8:
                t7bVar.i();
                t7bVar.j();
                t7bVar.f((Runnable) obj);
                break;
            case 9:
                fk2 fk2Var = (fk2) obj;
                h7b h7bVar2 = t7bVar.B0;
                t7bVar.A0 = fk2Var;
                h7bVar2.o(fk2Var);
                t7bVar.J0.setSelected(fk2Var);
                y6b y6bVar = t7bVar.C0;
                if (y6bVar != null) {
                    y6bVar.recordHevc = !t7bVar.B0.i();
                }
                t7bVar.H0.setDrawable(new gk2(fk2Var, false));
                t7bVar.b0(t7bVar.I0, t7bVar.J0.e, true);
                t7bVar.P0.e(true, t7bVar.B0.i() ? t7bVar.B0.getFilledProgress() : 0.0f);
                vr4 vr4Var = t7bVar.N0;
                if (vr4Var != null) {
                    vr4Var.setMultipleOnClick(t7bVar.B0.i());
                    t7bVar.N0.setMaxCount(Math.min(10, fk2.b() - t7bVar.B0.getFilledCount()));
                    break;
                }
                break;
            case 10:
                t7bVar.P = true;
                t7bVar.o(true);
                gl.e3(new mn0((p8c) obj, (byte) 13), 210L);
                break;
            case 11:
                Integer num2 = (Integer) obj;
                if (!t7bVar.Q1 && !t7bVar.R1) {
                    int intValue2 = num2.intValue();
                    t7bVar.P1 = intValue2;
                    t7bVar.p0.a(intValue2 == -1, true);
                    t7bVar.h0(t7bVar.P1 == 1 && !t7bVar.J0.e, true);
                    t7bVar.R0.a(num2.intValue());
                    f29 f29Var = t7bVar.P0;
                    boolean z3 = num2.intValue() == 1;
                    f29Var.o0 = -1.0f;
                    f29Var.p0 = z3;
                    f29Var.invalidate();
                    if (num2.intValue() == -1) {
                        y6b y6bVar2 = t7bVar.C0;
                        if (y6bVar2 != null && y6bVar2.isDual()) {
                            t7bVar.C0.toggleDual();
                        }
                        je5 je5Var = t7bVar.m1;
                        if (je5Var != null) {
                            je5Var.f(true);
                        }
                        je5 je5Var2 = t7bVar.n1;
                        if (je5Var2 != null) {
                            je5Var2.f(true);
                        }
                        je5 je5Var3 = t7bVar.X0;
                        if (je5Var3 != null) {
                            je5Var3.f(true);
                        }
                        t7bVar.B0.o(null);
                        t7bVar.B0.b();
                        t7bVar.J0.setSelected((fk2) null);
                        y6b y6bVar3 = t7bVar.C0;
                        if (y6bVar3 != null) {
                            y6bVar3.recordHevc = !t7bVar.B0.i();
                        }
                    }
                    t7bVar.J0.a(false, true);
                    t7bVar.l0(true);
                    break;
                }
                break;
            case 12:
                Float f = (Float) obj;
                f29 f29Var2 = t7bVar.P0;
                f29Var2.o0 = f.floatValue();
                f29Var2.invalidate();
                t7bVar.P0.setVisibility(f.floatValue() <= -1.0f ? 8 : 0);
                t7bVar.P0.setAlpha(Utilities.l(f.floatValue() + 1.0f));
                t7bVar.Q0.setVisibility(f.floatValue() < 0.0f ? 0 : 8);
                t7bVar.Q0.setAlpha(gl.x1(f.floatValue(), 0.0f, -1.0f));
                t7bVar.Q0.setScaleX(gl.R1(0.8f, 1.0f, gl.x1(f.floatValue(), 0.0f, -1.0f)));
                t7bVar.Q0.setScaleY(gl.R1(0.8f, 1.0f, gl.x1(f.floatValue(), 0.0f, -1.0f)));
                t7bVar.Q0.setTranslationY(gl.U1(gl.x1(f.floatValue(), 0.0f, -1.0f), gl.L(12.0f), 0));
                if (f.floatValue() < 0.0f) {
                    t7bVar.c(false);
                    break;
                }
                break;
            case 13:
                Integer num3 = (Integer) obj;
                if (t7bVar.L1 != null) {
                    j7b j7bVar = t7bVar.d1;
                    if (!j7bVar.O1) {
                        j7bVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                t7bVar.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            t7bVar.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        t7bVar.s();
                                        t7bVar.F();
                                        x6b x6bVar = t7bVar.w1;
                                        if (x6bVar != null) {
                                            x6bVar.R0(1);
                                            x6bVar.z0();
                                            break;
                                        }
                                    }
                                } else {
                                    t7bVar.k0(0, false, true);
                                    x6b x6bVar2 = t7bVar.w1;
                                    if (x6bVar2 != null) {
                                        x6bVar2.R0(2);
                                        x6bVar2.f2 = true;
                                        x6bVar2.l0(true);
                                        t7bVar.w1.C0 = true;
                                        break;
                                    }
                                }
                            } else {
                                t7bVar.k0(0, false, true);
                                x6b x6bVar3 = t7bVar.w1;
                                if (x6bVar3 != null) {
                                    x6bVar3.C0 = false;
                                    x6bVar3.R0(0);
                                    x6bVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            t7bVar.W();
                            break;
                        }
                    }
                }
                break;
            case 14:
                FrameLayout frameLayout = t7bVar.Z0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(t7bVar.h0 == 2 ? gl.L(68.0f) : gl.L(64.0f) + (-(gl.L(12.0f) + t7bVar.d1.getEditTextHeight())));
                }
                p6b p6bVar2 = t7bVar.e1;
                if (p6bVar2 != null) {
                    int i6 = -(gl.L(24.0f) + t7bVar.d1.getEditTextHeight());
                    p6bVar2.setTranslationY(i6 - (t7bVar.a1 == null ? 0 : r1.getContentHeight() - gl.L(5.0f)));
                }
                m21 m21Var2 = m21.w;
                if (m21Var2 != null && m21Var2.a == 2) {
                    m21Var2.l();
                }
                if (t7bVar.d1.p0 && (p6bVar = t7bVar.e1) != null) {
                    p6bVar.c(false, true);
                    break;
                }
                break;
            case 15:
                w5b w5bVar = (w5b) obj;
                f4b f4bVar4 = t7bVar.L1;
                if (f4bVar4 != null) {
                    f4bVar4.E0 = w5bVar;
                }
                ArrayList arrayList3 = t7bVar.I1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i < size) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        ((f4b) obj2).E0 = w5bVar;
                    }
                    break;
                }
                break;
            case 16:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                f4b f4bVar5 = t7bVar.L1;
                if (f4bVar5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    f4bVar5.v0 = inputPeer;
                    ArrayList arrayList4 = t7bVar.I1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        while (i < size2) {
                            Object obj3 = arrayList4.get(i);
                            i++;
                            ((f4b) obj3).v0 = t7bVar.L1.v0;
                        }
                        break;
                    }
                }
                break;
            case 17:
                HashSet hashSet = (HashSet) obj;
                f4b f4bVar6 = t7bVar.L1;
                if (f4bVar6 != null) {
                    f4bVar6.w0 = hashSet;
                    ArrayList arrayList5 = t7bVar.I1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        while (i < size3) {
                            Object obj4 = arrayList5.get(i);
                            i++;
                            ((f4b) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 18:
                Bitmap bitmap2 = (Bitmap) obj;
                f4b f4bVar7 = t7bVar.L1;
                if (f4bVar7 != null) {
                    Bitmap bitmap3 = f4bVar7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    t7bVar.L1.g0 = bitmap2;
                    y5b y5bVar2 = t7bVar.r0;
                    if (y5bVar2 != null) {
                        y5bVar2.O0(bitmap2);
                        break;
                    }
                }
                break;
            case 19:
                t7bVar.z0 = (w5b) obj;
                break;
            case 20:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                oy9 oy9Var = t7bVar.p0;
                t7bVar.y0 = inputPeer2;
                oy9Var.set(inputPeer2);
                break;
            default:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                oy9 oy9Var2 = t7bVar.p0;
                t7bVar.y0 = inputPeer3;
                oy9Var2.set(inputPeer3);
                break;
        }
    }
}
