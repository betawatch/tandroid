package fi;

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
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;

    public /* synthetic */ q9(sb sbVar, int i10) {
        this.a = i10;
        this.b = sbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        cc ccVar;
        ia iaVar;
        switch (this.a) {
            case 0:
                q2 q2Var = this.b.s;
                q2Var.p = ((Float) obj).floatValue();
                q2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                sb sbVar = this.b;
                w7 w7Var = sbVar.K1;
                if (w7Var != null) {
                    AndroidUtilities.recycleBitmap(w7Var.g0);
                    sbVar.K1.g0 = bitmap;
                    n9 n9Var = sbVar.q0;
                    if (n9Var != null) {
                        n9Var.o1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                w7 w7Var2 = (w7) obj;
                sb sbVar2 = this.b;
                sbVar2.V(w7Var2, false);
                int i10 = sbVar2.c;
                di.h7 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                di.g7 g7Var = new di.g7(storiesController, w7Var2);
                boolean z11 = w7Var2.g;
                long j10 = g7Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(w7Var2.f), g7Var);
                } else {
                    storiesController.d(j10, g7Var, storiesController.b, false);
                }
                storiesController.d(j10, g7Var, storiesController.c, true);
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
                        storiesController.e0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.R(j10);
                    }
                }
                g7Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (w7Var2.c && !w7Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(w7Var2);
                }
                if (w7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(w7Var2.a).cancelRequest(w7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                q6 q6Var = (q6) obj;
                sb sbVar3 = this.b;
                if (sbVar3.C0 != null) {
                    sbVar3.D0.setLink(q6Var == null ? null : q6Var.a);
                    fb fbVar = sbVar3.A0;
                    if (fbVar != null) {
                        fbVar.c.a(sbVar3.D0.y ? sbVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                w7 w7Var3 = this.b.K1;
                if (w7Var3 != null) {
                    w7Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                sb sbVar4 = this.b;
                di.b bVar = sbVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(sbVar4.b, new k8(1)).a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = sbVar4.r.getWidth();
                    layout.y = (int) (sbVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.a;
                    lbVar.getWindow().setAttributes(lbVar.b);
                }
                kbVar.setTouchable(true);
                new wc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.y6.gc, 0, new p9(sbVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                sb sbVar5 = this.b;
                if (booleanValue && (ccVar = sbVar5.Z0) != null && ccVar.P) {
                    ccVar.P = false;
                    if (ccVar.E && ccVar.h == null) {
                        ccVar.G = true;
                        wb wbVar = ccVar.a;
                        if (wbVar != null) {
                            wbVar.A(true);
                        }
                    }
                }
                sbVar5.X0.x(2, bool.booleanValue());
                sbVar5.Y0.clearAnimation();
                wh.p(sbVar5.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
                if (qcVar != null && qcVar.a == 2) {
                    qcVar.l();
                    break;
                }
                break;
            case 7:
                sb sbVar6 = this.b;
                sbVar6.k();
                sbVar6.l();
                sbVar6.h((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                sb sbVar7 = this.b;
                fb fbVar2 = sbVar7.A0;
                sbVar7.z0 = tVar;
                fbVar2.o(tVar);
                sbVar7.I0.setSelected(tVar);
                va vaVar = sbVar7.B0;
                if (vaVar != null) {
                    vaVar.recordHevc = !sbVar7.A0.j();
                }
                sbVar7.G0.setDrawable(new u(tVar, false));
                sbVar7.b0(sbVar7.H0, sbVar7.I0.e, true);
                sbVar7.O0.e(sbVar7.A0.j() ? sbVar7.A0.getFilledProgress() : 0.0f, true);
                qa qaVar = sbVar7.M0;
                if (qaVar != null) {
                    qaVar.setMultipleOnClick(sbVar7.A0.j());
                    sbVar7.M0.setMaxCount(Math.min(10, t.b() - sbVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                sb sbVar8 = this.b;
                sbVar8.O = true;
                sbVar8.p(true);
                AndroidUtilities.runOnUIThread(new ea(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                sb sbVar9 = this.b;
                if (!sbVar9.P1 && !sbVar9.Q1) {
                    int intValue2 = num2.intValue();
                    sbVar9.O1 = intValue2;
                    sbVar9.o0.a(intValue2 == -1, true);
                    sbVar9.h0(sbVar9.O1 == 1 && !sbVar9.I0.e, true);
                    sbVar9.Q0.a(num2.intValue());
                    w6 w6Var = sbVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    w6Var.n0 = -1.0f;
                    w6Var.o0 = z12;
                    w6Var.invalidate();
                    if (num2.intValue() == -1) {
                        va vaVar2 = sbVar9.B0;
                        if (vaVar2 != null && vaVar2.isDual()) {
                            sbVar9.B0.toggleDual();
                        }
                        v3 v3Var = sbVar9.l1;
                        if (v3Var != null) {
                            v3Var.e(true);
                        }
                        v3 v3Var2 = sbVar9.m1;
                        if (v3Var2 != null) {
                            v3Var2.e(true);
                        }
                        v3 v3Var3 = sbVar9.W0;
                        if (v3Var3 != null) {
                            v3Var3.e(true);
                        }
                        sbVar9.A0.o(null);
                        sbVar9.A0.e();
                        sbVar9.I0.setSelected((t) null);
                        va vaVar3 = sbVar9.B0;
                        if (vaVar3 != null) {
                            vaVar3.recordHevc = !sbVar9.A0.j();
                        }
                    }
                    sbVar9.I0.a(false, true);
                    sbVar9.l0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                sb sbVar10 = this.b;
                w6 w6Var2 = sbVar10.O0;
                w6Var2.n0 = f7.floatValue();
                w6Var2.invalidate();
                sbVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                sbVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                sbVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                sbVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                sbVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                sbVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                sbVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    sbVar10.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                sb sbVar11 = this.b;
                if (sbVar11.K1 != null) {
                    ib ibVar = sbVar11.c1;
                    if (!ibVar.O1) {
                        ibVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                sbVar11.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            sbVar11.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        sbVar11.t();
                                        sbVar11.G();
                                        ta taVar = sbVar11.v1;
                                        if (taVar != null) {
                                            taVar.O0(1);
                                            taVar.x0();
                                            break;
                                        }
                                    }
                                } else {
                                    sbVar11.k0(0, false, true);
                                    ta taVar2 = sbVar11.v1;
                                    if (taVar2 != null) {
                                        taVar2.O0(2);
                                        taVar2.a2 = true;
                                        taVar2.l0(true);
                                        sbVar11.v1.B0 = true;
                                        break;
                                    }
                                }
                            } else {
                                sbVar11.k0(0, false, true);
                                ta taVar3 = sbVar11.v1;
                                if (taVar3 != null) {
                                    taVar3.B0 = false;
                                    taVar3.O0(0);
                                    taVar3.A0(null, true);
                                    break;
                                }
                            }
                        } else {
                            sbVar11.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                sb sbVar12 = this.b;
                FrameLayout frameLayout = sbVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(sbVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + sbVar12.c1.getEditTextHeight())));
                }
                ia iaVar2 = sbVar12.d1;
                if (iaVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + sbVar12.c1.getEditTextHeight());
                    iaVar2.setTranslationY(i14 - (sbVar12.Z0 == null ? 0 : r4.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.x;
                if (qcVar2 != null && qcVar2.a == 2) {
                    qcVar2.l();
                }
                if (sbVar12.c1.p0 && (iaVar = sbVar12.d1) != null) {
                    iaVar.c(false, true);
                    break;
                }
                break;
            case 14:
                l9 l9Var = (l9) obj;
                sb sbVar13 = this.b;
                w7 w7Var4 = sbVar13.K1;
                if (w7Var4 != null) {
                    w7Var4.E0 = l9Var;
                }
                ArrayList arrayList3 = sbVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((w7) obj2).E0 = l9Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                sb sbVar14 = this.b;
                w7 w7Var5 = sbVar14.K1;
                if (w7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    w7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = sbVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((w7) obj3).v0 = sbVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                sb sbVar15 = this.b;
                w7 w7Var6 = sbVar15.K1;
                if (w7Var6 != null) {
                    w7Var6.w0 = hashSet;
                    ArrayList arrayList5 = sbVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((w7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                sb sbVar16 = this.b;
                w7 w7Var7 = sbVar16.K1;
                if (w7Var7 != null) {
                    Bitmap bitmap3 = w7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    sbVar16.K1.g0 = bitmap2;
                    n9 n9Var2 = sbVar16.q0;
                    if (n9Var2 != null) {
                        n9Var2.o1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (l9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                sb sbVar17 = this.b;
                p7 p7Var = sbVar17.o0;
                sbVar17.x0 = inputPeer2;
                p7Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                sb sbVar18 = this.b;
                p7 p7Var2 = sbVar18.o0;
                sbVar18.x0 = inputPeer3;
                p7Var2.set(inputPeer3);
                break;
            default:
                q2 q2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                q2Var2.o = floatValue;
                q2Var2.n = q2.f(floatValue);
                q2Var2.g();
                break;
        }
    }
}
