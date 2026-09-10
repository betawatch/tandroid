package bi;

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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ub implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce b;

    public /* synthetic */ ub(ce ceVar, int i10) {
        this.a = i10;
        this.b = ceVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        me meVar;
        oc ocVar;
        switch (this.a) {
            case 0:
                m3 m3Var = this.b.s;
                m3Var.p = ((Float) obj).floatValue();
                m3Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                ce ceVar = this.b;
                r9 r9Var = ceVar.K1;
                if (r9Var != null) {
                    AndroidUtilities.recycleBitmap(r9Var.g0);
                    ceVar.K1.g0 = bitmap;
                    rb rbVar = ceVar.q0;
                    if (rbVar != null) {
                        rbVar.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                r9 r9Var2 = (r9) obj;
                ce ceVar2 = this.b;
                ceVar2.W(r9Var2, false);
                int i10 = ceVar2.c;
                zh.i5 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.i iVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                zh.h5 h5Var = new zh.h5(storiesController, r9Var2);
                boolean z11 = r9Var2.g;
                long j3 = h5Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) iVar.f(j3);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        iVar.k(hashMap, j3);
                    }
                    hashMap.put(Integer.valueOf(r9Var2.f), h5Var);
                } else {
                    storiesController.d(j3, h5Var, storiesController.b, false);
                }
                storiesController.d(j3, h5Var, storiesController.c, true);
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
                h5Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (r9Var2.c && !r9Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(r9Var2);
                }
                if (r9Var2.e1 != 0) {
                    ConnectionsManager.getInstance(r9Var2.a).cancelRequest(r9Var2.e1, true);
                    break;
                }
                break;
            case 3:
                g8 g8Var = (g8) obj;
                ce ceVar3 = this.b;
                if (ceVar3.C0 != null) {
                    ceVar3.D0.setLink(g8Var == null ? null : g8Var.a);
                    md mdVar = ceVar3.A0;
                    if (mdVar != null) {
                        mdVar.c.b(ceVar3.D0.y ? ceVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                r9 r9Var3 = this.b.K1;
                if (r9Var3 != null) {
                    r9Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                ce ceVar4 = this.b;
                zh.b bVar = ceVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.kb(ceVar4.b, new fa(1)).a;
                WindowManager.LayoutParams layout = jbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = ceVar4.r.getWidth();
                    layout.y = (int) (ceVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.kb kbVar = jbVar.a;
                    kbVar.getWindow().setAttributes(kbVar.b);
                }
                jbVar.setTouchable(true);
                new org.telegram.ui.Components.wc(jbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.j6.gc, 0, new tb(ceVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ce ceVar5 = this.b;
                if (booleanValue && (meVar = ceVar5.Z0) != null && meVar.P) {
                    meVar.P = false;
                    if (meVar.E && meVar.h == null) {
                        meVar.G = true;
                        ge geVar = meVar.a;
                        if (geVar != null) {
                            geVar.S(true);
                        }
                    }
                }
                ceVar5.X0.x(2, bool.booleanValue());
                ceVar5.Y0.clearAnimation();
                ceVar5.Y0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
                if (pcVar != null && pcVar.a == 2) {
                    pcVar.l();
                    break;
                }
                break;
            case 7:
                ce ceVar6 = this.b;
                ceVar6.l();
                ceVar6.m();
                ceVar6.i((Runnable) obj);
                break;
            case 8:
                x xVar = (x) obj;
                ce ceVar7 = this.b;
                md mdVar2 = ceVar7.A0;
                ceVar7.z0 = xVar;
                mdVar2.o(xVar);
                ceVar7.I0.setSelected(xVar);
                bd bdVar = ceVar7.B0;
                if (bdVar != null) {
                    bdVar.recordHevc = !ceVar7.A0.j();
                }
                ceVar7.G0.setDrawable(new y(xVar, false));
                ceVar7.c0(ceVar7.H0, ceVar7.I0.e, true);
                ceVar7.O0.e(ceVar7.A0.j() ? ceVar7.A0.getFilledProgress() : 0.0f, true);
                xc xcVar = ceVar7.M0;
                if (xcVar != null) {
                    xcVar.setMultipleOnClick(ceVar7.A0.j());
                    ceVar7.M0.setMaxCount(Math.min(10, x.b() - ceVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                ce ceVar8 = this.b;
                ceVar8.O = true;
                ceVar8.q(true);
                AndroidUtilities.runOnUIThread(new jc(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                ce ceVar9 = this.b;
                if (!ceVar9.P1 && !ceVar9.Q1) {
                    int intValue2 = num2.intValue();
                    ceVar9.O1 = intValue2;
                    ceVar9.o0.a(intValue2 == -1, true);
                    ceVar9.i0(ceVar9.O1 == 1 && !ceVar9.I0.e, true);
                    ceVar9.Q0.a(num2.intValue());
                    m8 m8Var = ceVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    m8Var.n0 = -1.0f;
                    m8Var.o0 = z12;
                    m8Var.invalidate();
                    if (num2.intValue() == -1) {
                        bd bdVar2 = ceVar9.B0;
                        if (bdVar2 != null && bdVar2.isDual()) {
                            ceVar9.B0.toggleDual();
                        }
                        x4 x4Var = ceVar9.l1;
                        if (x4Var != null) {
                            x4Var.e(true);
                        }
                        x4 x4Var2 = ceVar9.m1;
                        if (x4Var2 != null) {
                            x4Var2.e(true);
                        }
                        x4 x4Var3 = ceVar9.W0;
                        if (x4Var3 != null) {
                            x4Var3.e(true);
                        }
                        ceVar9.A0.o(null);
                        ceVar9.A0.e();
                        ceVar9.I0.setSelected((x) null);
                        bd bdVar3 = ceVar9.B0;
                        if (bdVar3 != null) {
                            bdVar3.recordHevc = !ceVar9.A0.j();
                        }
                    }
                    ceVar9.I0.a(false, true);
                    ceVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                ce ceVar10 = this.b;
                m8 m8Var2 = ceVar10.O0;
                m8Var2.n0 = f7.floatValue();
                m8Var2.invalidate();
                ceVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                ceVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                ceVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                ceVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                ceVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                ceVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                ceVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    ceVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                ce ceVar11 = this.b;
                if (ceVar11.K1 != null) {
                    qd qdVar = ceVar11.c1;
                    if (!qdVar.O1) {
                        qdVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                ceVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            ceVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        ceVar11.u();
                                        ceVar11.H();
                                        ad adVar = ceVar11.v1;
                                        if (adVar != null) {
                                            adVar.R0(1);
                                            adVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    ceVar11.l0(0, false, true);
                                    ad adVar2 = ceVar11.v1;
                                    if (adVar2 != null) {
                                        adVar2.R0(2);
                                        adVar2.l2 = true;
                                        adVar2.o0(true);
                                        ceVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                ceVar11.l0(0, false, true);
                                ad adVar3 = ceVar11.v1;
                                if (adVar3 != null) {
                                    adVar3.M0 = false;
                                    adVar3.R0(0);
                                    adVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            ceVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                ce ceVar12 = this.b;
                FrameLayout frameLayout = ceVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(ceVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + ceVar12.c1.getEditTextHeight())));
                }
                oc ocVar2 = ceVar12.d1;
                if (ocVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + ceVar12.c1.getEditTextHeight());
                    ocVar2.setTranslationY(i14 - (ceVar12.Z0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.pc pcVar2 = org.telegram.ui.Components.pc.w;
                if (pcVar2 != null && pcVar2.a == 2) {
                    pcVar2.l();
                }
                if (ceVar12.c1.p0 && (ocVar = ceVar12.d1) != null) {
                    ocVar.c(false, true);
                    break;
                }
                break;
            case 14:
                pb pbVar = (pb) obj;
                ce ceVar13 = this.b;
                r9 r9Var4 = ceVar13.K1;
                if (r9Var4 != null) {
                    r9Var4.E0 = pbVar;
                }
                ArrayList arrayList3 = ceVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((r9) obj2).E0 = pbVar;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                ce ceVar14 = this.b;
                r9 r9Var5 = ceVar14.K1;
                if (r9Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    r9Var5.v0 = inputPeer;
                    ArrayList arrayList4 = ceVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((r9) obj3).v0 = ceVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                ce ceVar15 = this.b;
                r9 r9Var6 = ceVar15.K1;
                if (r9Var6 != null) {
                    r9Var6.w0 = hashSet;
                    ArrayList arrayList5 = ceVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((r9) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                ce ceVar16 = this.b;
                r9 r9Var7 = ceVar16.K1;
                if (r9Var7 != null) {
                    Bitmap bitmap3 = r9Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    ceVar16.K1.g0 = bitmap2;
                    rb rbVar2 = ceVar16.q0;
                    if (rbVar2 != null) {
                        rbVar2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (pb) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                ce ceVar17 = this.b;
                j9 j9Var = ceVar17.o0;
                ceVar17.x0 = inputPeer2;
                j9Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                ce ceVar18 = this.b;
                j9 j9Var2 = ceVar18.o0;
                ceVar18.x0 = inputPeer3;
                j9Var2.set(inputPeer3);
                break;
            default:
                m3 m3Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                m3Var2.o = floatValue;
                m3Var2.n = m3.f(floatValue);
                m3Var2.g();
                break;
        }
    }
}
