package ci;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class ia implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ lc b;

    public /* synthetic */ ia(lc lcVar, int i10) {
        this.a = i10;
        this.b = lcVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        wc wcVar;
        cb cbVar;
        switch (this.a) {
            case 0:
                x2 x2Var = this.b.s;
                x2Var.p = ((Float) obj).floatValue();
                x2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                lc lcVar = this.b;
                l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    AndroidUtilities.recycleBitmap(l8Var.g0);
                    lcVar.K1.g0 = bitmap;
                    fa faVar = lcVar.q0;
                    if (faVar != null) {
                        faVar.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                l8 l8Var2 = (l8) obj;
                lc lcVar2 = this.b;
                lcVar2.W(l8Var2, false);
                int i10 = lcVar2.c;
                ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.i iVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                ai.k9 k9Var = new ai.k9(storiesController, l8Var2);
                boolean z11 = l8Var2.g;
                long j3 = k9Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(l8Var2.f), k9Var);
                } else {
                    storiesController.d(j3, k9Var, storiesController.b, false);
                }
                storiesController.d(j3, k9Var, storiesController.c, true);
                if (j3 != UserConfig.getInstance(i11).clientUserId) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            z10 = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == j3) {
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
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i13)).peer) == j3) {
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
                        tL_peerStories.peer = MessagesController.getInstance(i11).getPeer(j3);
                        storiesController.b0(j3, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j3);
                    }
                }
                k9Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (l8Var2.c && !l8Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(l8Var2);
                }
                if (l8Var2.e1 != 0) {
                    ConnectionsManager.getInstance(l8Var2.a).cancelRequest(l8Var2.e1, true);
                    break;
                }
                break;
            case 3:
                d7 d7Var = (d7) obj;
                lc lcVar3 = this.b;
                if (lcVar3.C0 != null) {
                    lcVar3.D0.setLink(d7Var == null ? null : d7Var.a);
                    yb ybVar = lcVar3.A0;
                    if (ybVar != null) {
                        ybVar.c.b(lcVar3.D0.y ? lcVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                l8 l8Var3 = this.b.K1;
                if (l8Var3 != null) {
                    l8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                lc lcVar4 = this.b;
                ai.d dVar = lcVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(lcVar4.b, new a9(1)).a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = lcVar4.r.getWidth();
                    layout.y = (int) (lcVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.a;
                    lbVar.getWindow().setAttributes(lbVar.b);
                }
                kbVar.setTouchable(true);
                new org.telegram.ui.Components.xc(kbVar, dVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.h6.gc, 0, new ha(lcVar4, 27), dVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                lc lcVar5 = this.b;
                if (booleanValue && (wcVar = lcVar5.Z0) != null && wcVar.P) {
                    wcVar.P = false;
                    if (wcVar.E && wcVar.h == null) {
                        wcVar.G = true;
                        pc pcVar = wcVar.a;
                        if (pcVar != null) {
                            pcVar.Q(true);
                        }
                    }
                }
                lcVar5.X0.x(2, bool.booleanValue());
                lcVar5.Y0.clearAnimation();
                lcVar5.Y0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                if (qcVar != null && qcVar.a == 2) {
                    qcVar.l();
                    break;
                }
                break;
            case 7:
                lc lcVar6 = this.b;
                lcVar6.l();
                lcVar6.m();
                lcVar6.i((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                lc lcVar7 = this.b;
                yb ybVar2 = lcVar7.A0;
                lcVar7.z0 = tVar;
                ybVar2.o(tVar);
                lcVar7.I0.setSelected(tVar);
                ob obVar = lcVar7.B0;
                if (obVar != null) {
                    obVar.recordHevc = !lcVar7.A0.j();
                }
                lcVar7.G0.setDrawable(new u(tVar, false));
                lcVar7.c0(lcVar7.H0, lcVar7.I0.e, true);
                lcVar7.O0.e(lcVar7.A0.j() ? lcVar7.A0.getFilledProgress() : 0.0f, true);
                kb kbVar2 = lcVar7.M0;
                if (kbVar2 != null) {
                    kbVar2.setMultipleOnClick(lcVar7.A0.j());
                    lcVar7.M0.setMaxCount(Math.min(10, t.b() - lcVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                lc lcVar8 = this.b;
                lcVar8.O = true;
                lcVar8.q(true);
                AndroidUtilities.runOnUIThread(new xa(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                lc lcVar9 = this.b;
                if (!lcVar9.P1 && !lcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    lcVar9.O1 = intValue2;
                    lcVar9.o0.a(intValue2 == -1, true);
                    lcVar9.i0(lcVar9.O1 == 1 && !lcVar9.I0.e, true);
                    lcVar9.Q0.a(num2.intValue());
                    j7 j7Var = lcVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    j7Var.n0 = -1.0f;
                    j7Var.o0 = z12;
                    j7Var.invalidate();
                    if (num2.intValue() == -1) {
                        ob obVar2 = lcVar9.B0;
                        if (obVar2 != null && obVar2.isDual()) {
                            lcVar9.B0.toggleDual();
                        }
                        e4 e4Var = lcVar9.l1;
                        if (e4Var != null) {
                            e4Var.e(true);
                        }
                        e4 e4Var2 = lcVar9.m1;
                        if (e4Var2 != null) {
                            e4Var2.e(true);
                        }
                        e4 e4Var3 = lcVar9.W0;
                        if (e4Var3 != null) {
                            e4Var3.e(true);
                        }
                        lcVar9.A0.o(null);
                        lcVar9.A0.e();
                        lcVar9.I0.setSelected((t) null);
                        ob obVar3 = lcVar9.B0;
                        if (obVar3 != null) {
                            obVar3.recordHevc = !lcVar9.A0.j();
                        }
                    }
                    lcVar9.I0.a(false, true);
                    lcVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                lc lcVar10 = this.b;
                j7 j7Var2 = lcVar10.O0;
                j7Var2.n0 = f7.floatValue();
                j7Var2.invalidate();
                lcVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                lcVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                lcVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                lcVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                lcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                lcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                lcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    lcVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                lc lcVar11 = this.b;
                if (lcVar11.K1 != null) {
                    bc bcVar = lcVar11.c1;
                    if (!bcVar.O1) {
                        bcVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                lcVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            lcVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        lcVar11.u();
                                        lcVar11.H();
                                        nb nbVar = lcVar11.v1;
                                        if (nbVar != null) {
                                            nbVar.R0(1);
                                            nbVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    lcVar11.l0(0, false, true);
                                    nb nbVar2 = lcVar11.v1;
                                    if (nbVar2 != null) {
                                        nbVar2.R0(2);
                                        nbVar2.l2 = true;
                                        nbVar2.o0(true);
                                        lcVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                lcVar11.l0(0, false, true);
                                nb nbVar3 = lcVar11.v1;
                                if (nbVar3 != null) {
                                    nbVar3.M0 = false;
                                    nbVar3.R0(0);
                                    nbVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            lcVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                lc lcVar12 = this.b;
                FrameLayout frameLayout = lcVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(lcVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + lcVar12.c1.getEditTextHeight())));
                }
                cb cbVar2 = lcVar12.d1;
                if (cbVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + lcVar12.c1.getEditTextHeight());
                    cbVar2.setTranslationY(i14 - (lcVar12.Z0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.w;
                if (qcVar2 != null && qcVar2.a == 2) {
                    qcVar2.l();
                }
                if (lcVar12.c1.p0 && (cbVar = lcVar12.d1) != null) {
                    cbVar.c(false, true);
                    break;
                }
                break;
            case 14:
                da daVar = (da) obj;
                lc lcVar13 = this.b;
                l8 l8Var4 = lcVar13.K1;
                if (l8Var4 != null) {
                    l8Var4.E0 = daVar;
                }
                ArrayList arrayList3 = lcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((l8) obj2).E0 = daVar;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                lc lcVar14 = this.b;
                l8 l8Var5 = lcVar14.K1;
                if (l8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    l8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = lcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((l8) obj3).v0 = lcVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                lc lcVar15 = this.b;
                l8 l8Var6 = lcVar15.K1;
                if (l8Var6 != null) {
                    l8Var6.w0 = hashSet;
                    ArrayList arrayList5 = lcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((l8) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                lc lcVar16 = this.b;
                l8 l8Var7 = lcVar16.K1;
                if (l8Var7 != null) {
                    Bitmap bitmap3 = l8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    lcVar16.K1.g0 = bitmap2;
                    fa faVar2 = lcVar16.q0;
                    if (faVar2 != null) {
                        faVar2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (da) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                lc lcVar17 = this.b;
                e8 e8Var = lcVar17.o0;
                lcVar17.x0 = inputPeer2;
                e8Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                lc lcVar18 = this.b;
                e8 e8Var2 = lcVar18.o0;
                lcVar18.x0 = inputPeer3;
                e8Var2.set(inputPeer3);
                break;
            default:
                x2 x2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                x2Var2.o = floatValue;
                x2Var2.n = x2.f(floatValue);
                x2Var2.g();
                break;
        }
    }
}
