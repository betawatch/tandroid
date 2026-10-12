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
import org.telegram.messenger.yh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ha implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ ha(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        uc ucVar;
        bb bbVar;
        switch (this.a) {
            case 0:
                w2 w2Var = this.b.s;
                w2Var.p = ((Float) obj).floatValue();
                w2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                kc kcVar = this.b;
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    AndroidUtilities.recycleBitmap(k8Var.g0);
                    kcVar.K1.g0 = bitmap;
                    ea eaVar = kcVar.q0;
                    if (eaVar != null) {
                        eaVar.o1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                k8 k8Var2 = (k8) obj;
                kc kcVar2 = this.b;
                kcVar2.V(k8Var2, false);
                int i10 = kcVar2.c;
                bi.x8 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                bi.w8 w8Var = new bi.w8(storiesController, k8Var2);
                boolean z11 = k8Var2.g;
                long j10 = w8Var.J;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(k8Var2.f), w8Var);
                } else {
                    storiesController.d(j10, w8Var, storiesController.b, false);
                }
                storiesController.d(j10, w8Var, storiesController.c, true);
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
                w8Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (k8Var2.c && !k8Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.b(k8Var2);
                }
                if (k8Var2.e1 != 0) {
                    ConnectionsManager.getInstance(k8Var2.a).cancelRequest(k8Var2.e1, true);
                    break;
                }
                break;
            case 3:
                c7 c7Var = (c7) obj;
                kc kcVar3 = this.b;
                if (kcVar3.C0 != null) {
                    kcVar3.D0.setLink(c7Var == null ? null : c7Var.a);
                    xb xbVar = kcVar3.A0;
                    if (xbVar != null) {
                        xbVar.c.a(kcVar3.D0.y ? kcVar3.C0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                k8 k8Var3 = this.b.K1;
                if (k8Var3 != null) {
                    k8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                kc kcVar4 = this.b;
                bi.b bVar = kcVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.nb(kcVar4.b, new z8(1)).a;
                WindowManager.LayoutParams layout = mbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = kcVar4.r.getWidth();
                    layout.y = (int) (kcVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.nb nbVar = mbVar.a;
                    nbVar.getWindow().setAttributes(nbVar.b);
                }
                mbVar.setTouchable(true);
                new org.telegram.ui.Components.zc(mbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.g6.gc, 0, new ga(kcVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                kc kcVar5 = this.b;
                if (booleanValue && (ucVar = kcVar5.Z0) != null && ucVar.P) {
                    ucVar.P = false;
                    if (ucVar.E && ucVar.h == null) {
                        ucVar.G = true;
                        oc ocVar = ucVar.a;
                        if (ocVar != null) {
                            ocVar.R(true);
                        }
                    }
                }
                kcVar5.X0.x(2, bool.booleanValue());
                kcVar5.Y0.clearAnimation();
                yh.r(kcVar5.Y0.animate(), bool.booleanValue() ? 0.0f : 1.0f, 120L);
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.w;
                if (scVar != null && scVar.a == 2) {
                    scVar.l();
                    break;
                }
                break;
            case 7:
                kc kcVar6 = this.b;
                kcVar6.k();
                kcVar6.l();
                kcVar6.h((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                kc kcVar7 = this.b;
                xb xbVar2 = kcVar7.A0;
                kcVar7.z0 = tVar;
                xbVar2.o(tVar);
                kcVar7.I0.setSelected(tVar);
                nb nbVar2 = kcVar7.B0;
                if (nbVar2 != null) {
                    nbVar2.recordHevc = !kcVar7.A0.j();
                }
                kcVar7.G0.setDrawable(new u(tVar, false));
                kcVar7.b0(kcVar7.H0, kcVar7.I0.e, true);
                kcVar7.O0.e(kcVar7.A0.j() ? kcVar7.A0.getFilledProgress() : 0.0f, true);
                jb jbVar = kcVar7.M0;
                if (jbVar != null) {
                    jbVar.setMultipleOnClick(kcVar7.A0.j());
                    kcVar7.M0.setMaxCount(Math.min(10, t.b() - kcVar7.A0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                kc kcVar8 = this.b;
                kcVar8.O = true;
                kcVar8.p(true);
                AndroidUtilities.runOnUIThread(new wa(0, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                kc kcVar9 = this.b;
                if (!kcVar9.P1 && !kcVar9.Q1) {
                    int intValue2 = num2.intValue();
                    kcVar9.O1 = intValue2;
                    kcVar9.o0.a(intValue2 == -1, true);
                    kcVar9.h0(kcVar9.O1 == 1 && !kcVar9.I0.e, true);
                    kcVar9.Q0.a(num2.intValue());
                    i7 i7Var = kcVar9.O0;
                    boolean z12 = num2.intValue() == 1;
                    i7Var.n0 = -1.0f;
                    i7Var.o0 = z12;
                    i7Var.invalidate();
                    if (num2.intValue() == -1) {
                        nb nbVar3 = kcVar9.B0;
                        if (nbVar3 != null && nbVar3.isDual()) {
                            kcVar9.B0.toggleDual();
                        }
                        d4 d4Var = kcVar9.l1;
                        if (d4Var != null) {
                            d4Var.e(true);
                        }
                        d4 d4Var2 = kcVar9.m1;
                        if (d4Var2 != null) {
                            d4Var2.e(true);
                        }
                        d4 d4Var3 = kcVar9.W0;
                        if (d4Var3 != null) {
                            d4Var3.e(true);
                        }
                        kcVar9.A0.o(null);
                        kcVar9.A0.e();
                        kcVar9.I0.setSelected((t) null);
                        nb nbVar4 = kcVar9.B0;
                        if (nbVar4 != null) {
                            nbVar4.recordHevc = !kcVar9.A0.j();
                        }
                    }
                    kcVar9.I0.a(false, true);
                    kcVar9.l0(true);
                    break;
                }
                break;
            case 11:
                Float f7 = (Float) obj;
                kc kcVar10 = this.b;
                i7 i7Var2 = kcVar10.O0;
                i7Var2.n0 = f7.floatValue();
                i7Var2.invalidate();
                kcVar10.O0.setVisibility(f7.floatValue() <= -1.0f ? 8 : 0);
                kcVar10.O0.setAlpha(Utilities.clamp01(f7.floatValue() + 1.0f));
                kcVar10.P0.setVisibility(f7.floatValue() < 0.0f ? 0 : 8);
                kcVar10.P0.setAlpha(AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f));
                kcVar10.P0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                kcVar10.P0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f7.floatValue(), 0.0f, -1.0f)));
                if (f7.floatValue() < 0.0f) {
                    kcVar10.e(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                kc kcVar11 = this.b;
                if (kcVar11.K1 != null) {
                    ac acVar = kcVar11.c1;
                    if (!acVar.O1) {
                        acVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                kcVar11.k0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            kcVar11.k0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        kcVar11.t();
                                        kcVar11.G();
                                        mb mbVar2 = kcVar11.v1;
                                        if (mbVar2 != null) {
                                            mbVar2.Q0(1);
                                            mbVar2.z0();
                                            break;
                                        }
                                    }
                                } else {
                                    kcVar11.k0(0, false, true);
                                    mb mbVar3 = kcVar11.v1;
                                    if (mbVar3 != null) {
                                        mbVar3.Q0(2);
                                        mbVar3.l2 = true;
                                        mbVar3.n0(true);
                                        kcVar11.v1.M0 = true;
                                        break;
                                    }
                                }
                            } else {
                                kcVar11.k0(0, false, true);
                                mb mbVar4 = kcVar11.v1;
                                if (mbVar4 != null) {
                                    mbVar4.M0 = false;
                                    mbVar4.Q0(0);
                                    mbVar4.C0(null, true);
                                    break;
                                }
                            }
                        } else {
                            kcVar11.W();
                            break;
                        }
                    }
                }
                break;
            case 13:
                kc kcVar12 = this.b;
                FrameLayout frameLayout = kcVar12.Y0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(kcVar12.g0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + kcVar12.c1.getEditTextHeight())));
                }
                bb bbVar2 = kcVar12.d1;
                if (bbVar2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + kcVar12.c1.getEditTextHeight());
                    bbVar2.setTranslationY(i14 - (kcVar12.Z0 == null ? 0 : r4.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.sc scVar2 = org.telegram.ui.Components.sc.w;
                if (scVar2 != null && scVar2.a == 2) {
                    scVar2.l();
                }
                if (kcVar12.c1.p0 && (bbVar = kcVar12.d1) != null) {
                    bbVar.c(false, true);
                    break;
                }
                break;
            case 14:
                ca caVar = (ca) obj;
                kc kcVar13 = this.b;
                k8 k8Var4 = kcVar13.K1;
                if (k8Var4 != null) {
                    k8Var4.E0 = caVar;
                }
                ArrayList arrayList3 = kcVar13.H1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((k8) obj2).E0 = caVar;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                kc kcVar14 = this.b;
                k8 k8Var5 = kcVar14.K1;
                if (k8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    k8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = kcVar14.H1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((k8) obj3).v0 = kcVar14.K1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                kc kcVar15 = this.b;
                k8 k8Var6 = kcVar15.K1;
                if (k8Var6 != null) {
                    k8Var6.w0 = hashSet;
                    ArrayList arrayList5 = kcVar15.H1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((k8) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                kc kcVar16 = this.b;
                k8 k8Var7 = kcVar16.K1;
                if (k8Var7 != null) {
                    Bitmap bitmap3 = k8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    kcVar16.K1.g0 = bitmap2;
                    ea eaVar2 = kcVar16.q0;
                    if (eaVar2 != null) {
                        eaVar2.o1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.y0 = (ca) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                kc kcVar17 = this.b;
                d8 d8Var = kcVar17.o0;
                kcVar17.x0 = inputPeer2;
                d8Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                kc kcVar18 = this.b;
                d8 d8Var2 = kcVar18.o0;
                kcVar18.x0 = inputPeer3;
                d8Var2.set(inputPeer3);
                break;
            default:
                w2 w2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                w2Var2.o = floatValue;
                w2Var2.n = w2.f(floatValue);
                w2Var2.g();
                break;
        }
    }
}
