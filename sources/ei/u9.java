package ei;

import android.graphics.Bitmap;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb b;

    public /* synthetic */ u9(vb vbVar, int i10) {
        this.a = i10;
        this.b = vbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        gc gcVar;
        ma maVar;
        switch (this.a) {
            case 0:
                s2 s2Var = this.b.s;
                s2Var.p = ((Float) obj).floatValue();
                s2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                vb vbVar = this.b;
                a8 a8Var = vbVar.K1;
                if (a8Var != null) {
                    AndroidUtilities.recycleBitmap(a8Var.g0);
                    vbVar.K1.g0 = bitmap;
                    r9 r9Var = vbVar.q0;
                    if (r9Var != null) {
                        r9Var.o1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                a8 a8Var2 = (a8) obj;
                vb vbVar2 = this.b;
                vbVar2.V(a8Var2, false);
                int i10 = vbVar2.c;
                ci.i7 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                ci.h7 h7Var = new ci.h7(storiesController, a8Var2);
                boolean z11 = a8Var2.g;
                long j10 = h7Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(a8Var2.f), h7Var);
                } else {
                    storiesController.d(j10, h7Var, storiesController.b, false);
                }
                storiesController.d(j10, h7Var, storiesController.c, true);
                if (j10 != UserConfig.getInstance(i11).clientUserId) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            z10 = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == j10) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i12));
                            z10 = true;
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        int i13 = 0;
                        while (true) {
                            if (i13 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i13));
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i11).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                h7Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (a8Var2.c && !a8Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(a8Var2);
                }
                if (a8Var2.e1 != 0) {
                    ConnectionsManager.getInstance(a8Var2.a).cancelRequest(a8Var2.e1, true);
                    break;
                }
                break;
            case 3:
                t6 t6Var = (t6) obj;
                vb vbVar3 = this.b;
                if (vbVar3.C0 != null) {
                    vbVar3.D0.setLink(t6Var == null ? null : t6Var.a);
                    ib ibVar = vbVar3.A0;
                    if (ibVar != null) {
                        ibVar.c.a(vbVar3.D0.y ? vbVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                a8 a8Var3 = this.b.K1;
                if (a8Var3 != null) {
                    a8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                vb vbVar4 = this.b;
                ci.b bVar = vbVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(vbVar4.b, new o8(1)).a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = vbVar4.r.getWidth();
                    layout.y = (int) (vbVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.a;
                    lbVar.getWindow().setAttributes(lbVar.b);
                }
                kbVar.setTouchable(true);
                new xc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.h6.gc, 0, new t9(vbVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                vb vbVar5 = this.b;
                if (booleanValue && (gcVar = vbVar5.Z0) != null && gcVar.P) {
                    gcVar.P = false;
                    if (gcVar.E && gcVar.h == null) {
                        gcVar.G = true;
                        zb zbVar = gcVar.a;
                        if (zbVar != null) {
                            zbVar.E(true);
                        }
                    }
                }
                vbVar5.X0.x(2, bool.booleanValue());
                vbVar5.Y0.clearAnimation();
                wh.s(vbVar5.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                if (qcVar != null && qcVar.a == 2) {
                    qcVar.l();
                    break;
                }
                break;
            case 7:
                vb vbVar6 = this.b;
                vbVar6.k();
                vbVar6.l();
                vbVar6.h((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                vb vbVar7 = this.b;
                ib ibVar2 = vbVar7.A0;
                vbVar7.z0 = tVar;
                ibVar2.o(tVar);
                vbVar7.I0.setSelected(tVar);
                ya yaVar = vbVar7.B0;
                if (yaVar != null) {
                    yaVar.recordHevc = !vbVar7.A0.j();
                }
                vbVar7.G0.setDrawable(new u(tVar, false));
                vbVar7.b0(vbVar7.H0, vbVar7.I0.e, true);
                vbVar7.O0.e(vbVar7.A0.j() ? vbVar7.A0.getFilledProgress() : 0.0f, true);
                ua uaVar = vbVar7.M0;
                if (uaVar != null) {
                    uaVar.setMultipleOnClick(vbVar7.A0.j());
                    vbVar7.M0.setMaxCount(Math.min(10, t.b() - vbVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                vb vbVar8 = this.b;
                vbVar8.O = true;
                vbVar8.p(true);
                AndroidUtilities.runOnUIThread(new ia(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                vb vbVar9 = this.b;
                if (!vbVar9.P1 && !vbVar9.Q1) {
                    int intValue2 = num2.intValue();
                    vbVar9.O1 = intValue2;
                    vbVar9.o0.a(intValue2 == -1, true);
                    vbVar9.h0(vbVar9.O1 == 1 && !vbVar9.I0.e, true);
                    vbVar9.Q0.a(num2.intValue());
                    z6 z6Var = vbVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    z6Var.n0 = -1.0f;
                    z6Var.o0 = z12;
                    z6Var.invalidate();
                    if (num2.intValue() == -1) {
                        ya yaVar2 = vbVar9.B0;
                        if (yaVar2 != null && yaVar2.isDual()) {
                            vbVar9.B0.toggleDual();
                        }
                        x3 x3Var = vbVar9.l1;
                        if (x3Var != null) {
                            x3Var.e(true);
                        }
                        x3 x3Var2 = vbVar9.m1;
                        if (x3Var2 != null) {
                            x3Var2.e(true);
                        }
                        x3 x3Var3 = vbVar9.W0;
                        if (x3Var3 != null) {
                            x3Var3.e(true);
                        }
                        vbVar9.A0.o(null);
                        vbVar9.A0.e();
                        vbVar9.I0.setSelected((t) null);
                        ya yaVar3 = vbVar9.B0;
                        if (yaVar3 != null) {
                            yaVar3.recordHevc = !vbVar9.A0.j();
                        }
                    }
                    vbVar9.I0.a(false, true);
                    vbVar9.l0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                vb vbVar10 = this.b;
                z6 z6Var2 = vbVar10.O0;
                z6Var2.n0 = f7.floatValue();
                z6Var2.invalidate();
                vbVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                vbVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                vbVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                vbVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                vbVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                vbVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                vbVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    vbVar10.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                vb vbVar11 = this.b;
                if (vbVar11.K1 != null) {
                    lb lbVar2 = vbVar11.c1;
                    if (!lbVar2.O1) {
                        lbVar2.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                vbVar11.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            vbVar11.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        vbVar11.t();
                                        vbVar11.G();
                                        xa xaVar = vbVar11.v1;
                                        if (xaVar != null) {
                                            xaVar.Q0(1);
                                            xaVar.z0();
                                            break;
                                        }
                                    }
                                } else {
                                    vbVar11.k0(0, false, true);
                                    xa xaVar2 = vbVar11.v1;
                                    if (xaVar2 != null) {
                                        xaVar2.Q0(2);
                                        xaVar2.l2 = true;
                                        xaVar2.n0(true);
                                        vbVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                vbVar11.k0(0, false, true);
                                xa xaVar3 = vbVar11.v1;
                                if (xaVar3 != null) {
                                    xaVar3.M0 = false;
                                    xaVar3.Q0(0);
                                    xaVar3.C0(null, true);
                                    break;
                                }
                            }
                        } else {
                            vbVar11.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                vb vbVar12 = this.b;
                FrameLayout frameLayout = vbVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(vbVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + vbVar12.c1.getEditTextHeight())));
                }
                ma maVar2 = vbVar12.d1;
                if (maVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + vbVar12.c1.getEditTextHeight());
                    maVar2.setTranslationY(i14 - (vbVar12.Z0 == null ? 0 : r4.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.w;
                if (qcVar2 != null && qcVar2.a == 2) {
                    qcVar2.l();
                }
                if (vbVar12.c1.p0 && (maVar = vbVar12.d1) != null) {
                    maVar.c(false, true);
                    break;
                }
                break;
            case 14:
                p9 p9Var = (p9) obj;
                vb vbVar13 = this.b;
                a8 a8Var4 = vbVar13.K1;
                if (a8Var4 != null) {
                    a8Var4.E0 = p9Var;
                }
                ArrayList arrayList3 = vbVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((a8) obj2).E0 = p9Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                vb vbVar14 = this.b;
                a8 a8Var5 = vbVar14.K1;
                if (a8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    a8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = vbVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((a8) obj3).v0 = vbVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                vb vbVar15 = this.b;
                a8 a8Var6 = vbVar15.K1;
                if (a8Var6 != null) {
                    a8Var6.w0 = hashSet;
                    ArrayList arrayList5 = vbVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((a8) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                vb vbVar16 = this.b;
                a8 a8Var7 = vbVar16.K1;
                if (a8Var7 != null) {
                    Bitmap bitmap3 = a8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    vbVar16.K1.g0 = bitmap2;
                    r9 r9Var2 = vbVar16.q0;
                    if (r9Var2 != null) {
                        r9Var2.o1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (p9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                vb vbVar17 = this.b;
                t7 t7Var = vbVar17.o0;
                vbVar17.x0 = inputPeer2;
                t7Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                vb vbVar18 = this.b;
                t7 t7Var2 = vbVar18.o0;
                vbVar18.x0 = inputPeer3;
                t7Var2.set(inputPeer3);
                break;
            default:
                s2 s2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                s2Var2.o = floatValue;
                s2Var2.n = s2.f(floatValue);
                s2Var2.g();
                break;
        }
    }
}
