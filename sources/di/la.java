package di;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ la(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        zc zcVar;
        fb fbVar;
        switch (this.a) {
            case 0:
                y2 y2Var = this.b.s;
                y2Var.p = ((Float) obj).floatValue();
                y2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                pc pcVar = this.b;
                o8 o8Var = pcVar.K1;
                if (o8Var != null) {
                    AndroidUtilities.recycleBitmap(o8Var.g0);
                    pcVar.K1.g0 = bitmap;
                    ia iaVar = pcVar.q0;
                    if (iaVar != null) {
                        iaVar.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                o8 o8Var2 = (o8) obj;
                pc pcVar2 = this.b;
                pcVar2.W(o8Var2, false);
                int i10 = pcVar2.c;
                bi.u8 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.i iVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                bi.t8 t8Var = new bi.t8(storiesController, o8Var2);
                boolean z11 = o8Var2.g;
                long j3 = t8Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(o8Var2.f), t8Var);
                } else {
                    storiesController.d(j3, t8Var, storiesController.b, false);
                }
                storiesController.d(j3, t8Var, storiesController.c, true);
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
                t8Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (o8Var2.c && !o8Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(o8Var2);
                }
                if (o8Var2.e1 != 0) {
                    ConnectionsManager.getInstance(o8Var2.a).cancelRequest(o8Var2.e1, true);
                    break;
                }
                break;
            case 3:
                f7 f7Var = (f7) obj;
                pc pcVar3 = this.b;
                if (pcVar3.C0 != null) {
                    pcVar3.D0.setLink(f7Var == null ? null : f7Var.a);
                    cc ccVar = pcVar3.A0;
                    if (ccVar != null) {
                        ccVar.c.b(pcVar3.D0.y ? pcVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                o8 o8Var3 = this.b.K1;
                if (o8Var3 != null) {
                    o8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                pc pcVar4 = this.b;
                bi.b bVar = pcVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.lb(pcVar4.b, new c9(1)).a;
                WindowManager.LayoutParams layout = kbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = pcVar4.r.getWidth();
                    layout.y = (int) (pcVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.lb lbVar = kbVar.a;
                    lbVar.getWindow().setAttributes(lbVar.b);
                }
                kbVar.setTouchable(true);
                new org.telegram.ui.Components.yc(kbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new ka(pcVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                pc pcVar5 = this.b;
                if (booleanValue && (zcVar = pcVar5.Z0) != null && zcVar.P) {
                    zcVar.P = false;
                    if (zcVar.E && zcVar.h == null) {
                        zcVar.G = true;
                        tc tcVar = zcVar.a;
                        if (tcVar != null) {
                            tcVar.J(true);
                        }
                    }
                }
                pcVar5.X0.x(2, bool.booleanValue());
                pcVar5.Y0.clearAnimation();
                pcVar5.Y0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
                if (qcVar != null && qcVar.a == 2) {
                    qcVar.l();
                    break;
                }
                break;
            case 7:
                pc pcVar6 = this.b;
                pcVar6.l();
                pcVar6.m();
                pcVar6.i((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                pc pcVar7 = this.b;
                cc ccVar2 = pcVar7.A0;
                pcVar7.z0 = tVar;
                ccVar2.o(tVar);
                pcVar7.I0.setSelected(tVar);
                sb sbVar = pcVar7.B0;
                if (sbVar != null) {
                    sbVar.recordHevc = !pcVar7.A0.j();
                }
                pcVar7.G0.setDrawable(new u(tVar, false));
                pcVar7.c0(pcVar7.H0, pcVar7.I0.e, true);
                pcVar7.O0.e(pcVar7.A0.j() ? pcVar7.A0.getFilledProgress() : 0.0f, true);
                ob obVar = pcVar7.M0;
                if (obVar != null) {
                    obVar.setMultipleOnClick(pcVar7.A0.j());
                    pcVar7.M0.setMaxCount(Math.min(10, t.b() - pcVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                pc pcVar8 = this.b;
                pcVar8.O = true;
                pcVar8.q(true);
                AndroidUtilities.runOnUIThread(new ab(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                pc pcVar9 = this.b;
                if (!pcVar9.P1 && !pcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    pcVar9.O1 = intValue2;
                    pcVar9.o0.a(intValue2 == -1, true);
                    pcVar9.i0(pcVar9.O1 == 1 && !pcVar9.I0.e, true);
                    pcVar9.Q0.a(num2.intValue());
                    l7 l7Var = pcVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    l7Var.n0 = -1.0f;
                    l7Var.o0 = z12;
                    l7Var.invalidate();
                    if (num2.intValue() == -1) {
                        sb sbVar2 = pcVar9.B0;
                        if (sbVar2 != null && sbVar2.isDual()) {
                            pcVar9.B0.toggleDual();
                        }
                        f4 f4Var = pcVar9.l1;
                        if (f4Var != null) {
                            f4Var.e(true);
                        }
                        f4 f4Var2 = pcVar9.m1;
                        if (f4Var2 != null) {
                            f4Var2.e(true);
                        }
                        f4 f4Var3 = pcVar9.W0;
                        if (f4Var3 != null) {
                            f4Var3.e(true);
                        }
                        pcVar9.A0.o(null);
                        pcVar9.A0.e();
                        pcVar9.I0.setSelected((t) null);
                        sb sbVar3 = pcVar9.B0;
                        if (sbVar3 != null) {
                            sbVar3.recordHevc = !pcVar9.A0.j();
                        }
                    }
                    pcVar9.I0.a(false, true);
                    pcVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                pc pcVar10 = this.b;
                l7 l7Var2 = pcVar10.O0;
                l7Var2.n0 = f7.floatValue();
                l7Var2.invalidate();
                pcVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                pcVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                pcVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                pcVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                pcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                pcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                pcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    pcVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                pc pcVar11 = this.b;
                if (pcVar11.K1 != null) {
                    fc fcVar = pcVar11.c1;
                    if (!fcVar.O1) {
                        fcVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                pcVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            pcVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        pcVar11.u();
                                        pcVar11.H();
                                        rb rbVar = pcVar11.v1;
                                        if (rbVar != null) {
                                            rbVar.R0(1);
                                            rbVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    pcVar11.l0(0, false, true);
                                    rb rbVar2 = pcVar11.v1;
                                    if (rbVar2 != null) {
                                        rbVar2.R0(2);
                                        rbVar2.l2 = true;
                                        rbVar2.o0(true);
                                        pcVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                pcVar11.l0(0, false, true);
                                rb rbVar3 = pcVar11.v1;
                                if (rbVar3 != null) {
                                    rbVar3.M0 = false;
                                    rbVar3.R0(0);
                                    rbVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            pcVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                pc pcVar12 = this.b;
                FrameLayout frameLayout = pcVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(pcVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + pcVar12.c1.getEditTextHeight())));
                }
                fb fbVar2 = pcVar12.d1;
                if (fbVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + pcVar12.c1.getEditTextHeight());
                    fbVar2.setTranslationY(i14 - (pcVar12.Z0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.qc qcVar2 = org.telegram.ui.Components.qc.w;
                if (qcVar2 != null && qcVar2.a == 2) {
                    qcVar2.l();
                }
                if (pcVar12.c1.p0 && (fbVar = pcVar12.d1) != null) {
                    fbVar.c(false, true);
                    break;
                }
                break;
            case 14:
                ga gaVar = (ga) obj;
                pc pcVar13 = this.b;
                o8 o8Var4 = pcVar13.K1;
                if (o8Var4 != null) {
                    o8Var4.E0 = gaVar;
                }
                ArrayList arrayList3 = pcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((o8) obj2).E0 = gaVar;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                pc pcVar14 = this.b;
                o8 o8Var5 = pcVar14.K1;
                if (o8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = pcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((o8) obj3).v0 = pcVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                pc pcVar15 = this.b;
                o8 o8Var6 = pcVar15.K1;
                if (o8Var6 != null) {
                    o8Var6.w0 = hashSet;
                    ArrayList arrayList5 = pcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((o8) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                pc pcVar16 = this.b;
                o8 o8Var7 = pcVar16.K1;
                if (o8Var7 != null) {
                    Bitmap bitmap3 = o8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    pcVar16.K1.g0 = bitmap2;
                    ia iaVar2 = pcVar16.q0;
                    if (iaVar2 != null) {
                        iaVar2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (ga) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                pc pcVar17 = this.b;
                h8 h8Var = pcVar17.o0;
                pcVar17.x0 = inputPeer2;
                h8Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                pc pcVar18 = this.b;
                h8 h8Var2 = pcVar18.o0;
                pcVar18.x0 = inputPeer3;
                h8Var2.set(inputPeer3);
                break;
            default:
                y2 y2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                y2Var2.o = floatValue;
                y2Var2.n = y2.f(floatValue);
                y2Var2.g();
                break;
        }
    }
}
