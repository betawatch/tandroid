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
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ la(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
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
                oc ocVar = this.b;
                o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    AndroidUtilities.recycleBitmap(o8Var.g0);
                    ocVar.K1.g0 = bitmap;
                    ia iaVar = ocVar.q0;
                    if (iaVar != null) {
                        iaVar.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                o8 o8Var2 = (o8) obj;
                oc ocVar2 = this.b;
                ocVar2.W(o8Var2, false);
                int i10 = ocVar2.c;
                ai.l9 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.i iVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                ai.k9 k9Var = new ai.k9(storiesController, o8Var2);
                boolean z11 = o8Var2.g;
                long j3 = k9Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(o8Var2.f), k9Var);
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
                oc ocVar3 = this.b;
                if (ocVar3.C0 != null) {
                    ocVar3.D0.setLink(f7Var == null ? null : f7Var.a);
                    bc bcVar = ocVar3.A0;
                    if (bcVar != null) {
                        bcVar.c.b(ocVar3.D0.y ? ocVar3.C0.d : null);
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
                oc ocVar4 = this.b;
                ai.d dVar = ocVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.kb(ocVar4.b, new d9(1)).a;
                WindowManager.LayoutParams layout = jbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = ocVar4.r.getWidth();
                    layout.y = (int) (ocVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.kb kbVar = jbVar.a;
                    kbVar.getWindow().setAttributes(kbVar.b);
                }
                jbVar.setTouchable(true);
                new org.telegram.ui.Components.xc(jbVar, dVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new ka(ocVar4, 27), dVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                oc ocVar5 = this.b;
                if (booleanValue && (zcVar = ocVar5.Z0) != null && zcVar.P) {
                    zcVar.P = false;
                    if (zcVar.E && zcVar.h == null) {
                        zcVar.G = true;
                        sc scVar = zcVar.a;
                        if (scVar != null) {
                            scVar.O(true);
                        }
                    }
                }
                ocVar5.X0.x(2, bool.booleanValue());
                ocVar5.Y0.clearAnimation();
                rk.r(ocVar5.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
                if (pcVar != null && pcVar.a == 2) {
                    pcVar.l();
                    break;
                }
                break;
            case 7:
                oc ocVar6 = this.b;
                ocVar6.l();
                ocVar6.m();
                ocVar6.i((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                oc ocVar7 = this.b;
                bc bcVar2 = ocVar7.A0;
                ocVar7.z0 = tVar;
                bcVar2.o(tVar);
                ocVar7.I0.setSelected(tVar);
                rb rbVar = ocVar7.B0;
                if (rbVar != null) {
                    rbVar.recordHevc = !ocVar7.A0.j();
                }
                ocVar7.G0.setDrawable(new u(tVar, false));
                ocVar7.c0(ocVar7.H0, ocVar7.I0.e, true);
                ocVar7.O0.e(ocVar7.A0.j() ? ocVar7.A0.getFilledProgress() : 0.0f, true);
                nb nbVar = ocVar7.M0;
                if (nbVar != null) {
                    nbVar.setMultipleOnClick(ocVar7.A0.j());
                    ocVar7.M0.setMaxCount(Math.min(10, t.b() - ocVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                oc ocVar8 = this.b;
                ocVar8.O = true;
                ocVar8.q(true);
                AndroidUtilities.runOnUIThread(new ab(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                oc ocVar9 = this.b;
                if (!ocVar9.P1 && !ocVar9.Q1) {
                    int intValue2 = num2.intValue();
                    ocVar9.O1 = intValue2;
                    ocVar9.o0.a(intValue2 == -1, true);
                    ocVar9.i0(ocVar9.O1 == 1 && !ocVar9.I0.e, true);
                    ocVar9.Q0.a(num2.intValue());
                    l7 l7Var = ocVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    l7Var.n0 = -1.0f;
                    l7Var.o0 = z12;
                    l7Var.invalidate();
                    if (num2.intValue() == -1) {
                        rb rbVar2 = ocVar9.B0;
                        if (rbVar2 != null && rbVar2.isDual()) {
                            ocVar9.B0.toggleDual();
                        }
                        f4 f4Var = ocVar9.l1;
                        if (f4Var != null) {
                            f4Var.e(true);
                        }
                        f4 f4Var2 = ocVar9.m1;
                        if (f4Var2 != null) {
                            f4Var2.e(true);
                        }
                        f4 f4Var3 = ocVar9.W0;
                        if (f4Var3 != null) {
                            f4Var3.e(true);
                        }
                        ocVar9.A0.o(null);
                        ocVar9.A0.e();
                        ocVar9.I0.setSelected((t) null);
                        rb rbVar3 = ocVar9.B0;
                        if (rbVar3 != null) {
                            rbVar3.recordHevc = !ocVar9.A0.j();
                        }
                    }
                    ocVar9.I0.a(false, true);
                    ocVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                oc ocVar10 = this.b;
                l7 l7Var2 = ocVar10.O0;
                l7Var2.n0 = f7.floatValue();
                l7Var2.invalidate();
                ocVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                ocVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                ocVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                ocVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                ocVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                ocVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                ocVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    ocVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                oc ocVar11 = this.b;
                if (ocVar11.K1 != null) {
                    ec ecVar = ocVar11.c1;
                    if (!ecVar.O1) {
                        ecVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                ocVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            ocVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        ocVar11.u();
                                        ocVar11.H();
                                        qb qbVar = ocVar11.v1;
                                        if (qbVar != null) {
                                            qbVar.R0(1);
                                            qbVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    ocVar11.l0(0, false, true);
                                    qb qbVar2 = ocVar11.v1;
                                    if (qbVar2 != null) {
                                        qbVar2.R0(2);
                                        qbVar2.l2 = true;
                                        qbVar2.o0(true);
                                        ocVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                ocVar11.l0(0, false, true);
                                qb qbVar3 = ocVar11.v1;
                                if (qbVar3 != null) {
                                    qbVar3.M0 = false;
                                    qbVar3.R0(0);
                                    qbVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            ocVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                oc ocVar12 = this.b;
                FrameLayout frameLayout = ocVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(ocVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ocVar12.c1.getEditTextHeight())));
                }
                fb fbVar2 = ocVar12.d1;
                if (fbVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + ocVar12.c1.getEditTextHeight());
                    fbVar2.setTranslationY(i14 - (ocVar12.Z0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.pc pcVar2 = org.telegram.ui.Components.pc.w;
                if (pcVar2 != null && pcVar2.a == 2) {
                    pcVar2.l();
                }
                if (ocVar12.c1.p0 && (fbVar = ocVar12.d1) != null) {
                    fbVar.c(false, true);
                    break;
                }
                break;
            case 14:
                ga gaVar = (ga) obj;
                oc ocVar13 = this.b;
                o8 o8Var4 = ocVar13.K1;
                if (o8Var4 != null) {
                    o8Var4.E0 = gaVar;
                }
                ArrayList arrayList3 = ocVar13.H1;
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
                oc ocVar14 = this.b;
                o8 o8Var5 = ocVar14.K1;
                if (o8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = ocVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((o8) obj3).v0 = ocVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                oc ocVar15 = this.b;
                o8 o8Var6 = ocVar15.K1;
                if (o8Var6 != null) {
                    o8Var6.w0 = hashSet;
                    ArrayList arrayList5 = ocVar15.H1;
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
                oc ocVar16 = this.b;
                o8 o8Var7 = ocVar16.K1;
                if (o8Var7 != null) {
                    Bitmap bitmap3 = o8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    ocVar16.K1.g0 = bitmap2;
                    ia iaVar2 = ocVar16.q0;
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
                oc ocVar17 = this.b;
                h8 h8Var = ocVar17.o0;
                ocVar17.x0 = inputPeer2;
                h8Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                oc ocVar18 = this.b;
                h8 h8Var2 = ocVar18.o0;
                ocVar18.x0 = inputPeer3;
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
