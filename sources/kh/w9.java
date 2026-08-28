package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;

    public /* synthetic */ w9(wb wbVar, int i9) {
        this.a = i9;
        this.b = wbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        gc gcVar;
        na naVar;
        switch (this.a) {
            case 0:
                s2 s2Var = this.b.s;
                s2Var.p = ((Float) obj).floatValue();
                s2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                wb wbVar = this.b;
                a8 a8Var = wbVar.G1;
                if (a8Var != null) {
                    AndroidUtilities.recycleBitmap(a8Var.g0);
                    wbVar.G1.g0 = bitmap;
                    t9 t9Var = wbVar.m0;
                    if (t9Var != null) {
                        t9Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                a8 a8Var2 = (a8) obj;
                wb wbVar2 = this.b;
                wbVar2.W(a8Var2, false);
                int i9 = wbVar2.c;
                ih.v6 storiesController = MessagesController.getInstance(i9).getStoriesController();
                a0.h hVar = storiesController.e;
                int i10 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                ih.u6 u6Var = new ih.u6(storiesController, a8Var2);
                boolean z11 = a8Var2.g;
                long j10 = u6Var.F;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(a8Var2.f), u6Var);
                } else {
                    storiesController.d(j10, u6Var, storiesController.b, false);
                }
                storiesController.d(j10, u6Var, storiesController.c, true);
                if (j10 != UserConfig.getInstance(i10).clientUserId) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList2.size()) {
                            z10 = false;
                        } else if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == j10) {
                            arrayList2.add(0, (TL_stories.PeerStories) arrayList2.remove(i11));
                            z10 = true;
                        } else {
                            i11++;
                        }
                    }
                    if (!z10) {
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i12)).peer) == j10) {
                                    arrayList.add(0, (TL_stories.PeerStories) arrayList.remove(i12));
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = MessagesController.getInstance(i10).getPeer(j10);
                        storiesController.b0(j10, tL_peerStories);
                        arrayList2.add(0, tL_peerStories);
                        storiesController.O(j10);
                    }
                }
                u6Var.d();
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (a8Var2.c && !a8Var2.g) {
                    MessagesController.getInstance(i9).getStoriesController().w.c(a8Var2);
                }
                if (a8Var2.e1 != 0) {
                    ConnectionsManager.getInstance(a8Var2.a).cancelRequest(a8Var2.e1, true);
                    break;
                }
                break;
            case 3:
                t6 t6Var = (t6) obj;
                wb wbVar3 = this.b;
                if (wbVar3.y0 != null) {
                    wbVar3.z0.setLink(t6Var == null ? null : t6Var.a);
                    jb jbVar = wbVar3.w0;
                    if (jbVar != null) {
                        jbVar.c.a(wbVar3.z0.y ? wbVar3.y0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                a8 a8Var3 = this.b.G1;
                if (a8Var3 != null) {
                    a8Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                wb wbVar4 = this.b;
                ih.b bVar = wbVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.bb bbVar = new org.telegram.ui.Components.cb(wbVar4.b, new bg.z(5)).a;
                WindowManager.LayoutParams layout = bbVar.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = wbVar4.r.getWidth();
                    layout.y = (int) (wbVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.cb cbVar = bbVar.a;
                    cbVar.getWindow().setAttributes(cbVar.b);
                }
                bbVar.setTouchable(true);
                new org.telegram.ui.Components.oc(bbVar, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.f6.gc, 0, new v9(wbVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                wb wbVar5 = this.b;
                if (booleanValue && (gcVar = wbVar5.V0) != null && gcVar.L) {
                    gcVar.L = false;
                    if (gcVar.A && gcVar.h == null) {
                        gcVar.C = true;
                        ac acVar = gcVar.a;
                        if (acVar != null) {
                            acVar.j1(true);
                        }
                    }
                }
                wbVar5.T0.x(2, bool.booleanValue());
                wbVar5.U0.clearAnimation();
                wbVar5.U0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                org.telegram.ui.Components.gc gcVar2 = org.telegram.ui.Components.gc.w;
                if (gcVar2 != null && gcVar2.a == 2) {
                    gcVar2.l();
                    break;
                }
                break;
            case 7:
                wb wbVar6 = this.b;
                wbVar6.l();
                wbVar6.m();
                wbVar6.i((Runnable) obj);
                break;
            case 8:
                u uVar = (u) obj;
                wb wbVar7 = this.b;
                jb jbVar2 = wbVar7.w0;
                wbVar7.v0 = uVar;
                jbVar2.o(uVar);
                wbVar7.E0.setSelected(uVar);
                za zaVar = wbVar7.x0;
                if (zaVar != null) {
                    zaVar.recordHevc = !wbVar7.w0.j();
                }
                wbVar7.C0.setDrawable(new v(uVar, false));
                wbVar7.c0(wbVar7.D0, wbVar7.E0.e, true);
                wbVar7.K0.e(wbVar7.w0.j() ? wbVar7.w0.getFilledProgress() : 0.0f, true);
                va vaVar = wbVar7.I0;
                if (vaVar != null) {
                    vaVar.setMultipleOnClick(wbVar7.w0.j());
                    wbVar7.I0.setMaxCount(Math.min(10, u.b() - wbVar7.w0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                wb wbVar8 = this.b;
                wbVar8.K = true;
                wbVar8.q(true);
                AndroidUtilities.runOnUIThread(new bg.s0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                wb wbVar9 = this.b;
                if (!wbVar9.L1 && !wbVar9.M1) {
                    int intValue2 = num2.intValue();
                    wbVar9.K1 = intValue2;
                    wbVar9.k0.a(intValue2 == -1, true);
                    wbVar9.i0(wbVar9.K1 == 1 && !wbVar9.E0.e, true);
                    wbVar9.M0.a(num2.intValue());
                    z6 z6Var = wbVar9.K0;
                    boolean z12 = num2.intValue() == 1;
                    z6Var.j0 = -1.0f;
                    z6Var.k0 = z12;
                    z6Var.invalidate();
                    if (num2.intValue() == -1) {
                        za zaVar2 = wbVar9.x0;
                        if (zaVar2 != null && zaVar2.isDual()) {
                            wbVar9.x0.toggleDual();
                        }
                        x3 x3Var = wbVar9.h1;
                        if (x3Var != null) {
                            x3Var.e(true);
                        }
                        x3 x3Var2 = wbVar9.i1;
                        if (x3Var2 != null) {
                            x3Var2.e(true);
                        }
                        x3 x3Var3 = wbVar9.S0;
                        if (x3Var3 != null) {
                            x3Var3.e(true);
                        }
                        wbVar9.w0.o(null);
                        wbVar9.w0.e();
                        wbVar9.E0.setSelected((u) null);
                        za zaVar3 = wbVar9.x0;
                        if (zaVar3 != null) {
                            zaVar3.recordHevc = !wbVar9.w0.j();
                        }
                    }
                    wbVar9.E0.a(false, true);
                    wbVar9.m0(true);
                    break;
                }
                break;
            case 11:
                Float f10 = (Float) obj;
                wb wbVar10 = this.b;
                z6 z6Var2 = wbVar10.K0;
                z6Var2.j0 = f10.floatValue();
                z6Var2.invalidate();
                wbVar10.K0.setVisibility(f10.floatValue() <= -1.0f ? 8 : 0);
                wbVar10.K0.setAlpha(Utilities.clamp01(f10.floatValue() + 1.0f));
                wbVar10.L0.setVisibility(f10.floatValue() < 0.0f ? 0 : 8);
                wbVar10.L0.setAlpha(AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f));
                wbVar10.L0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                wbVar10.L0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                wbVar10.L0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f10.floatValue(), 0.0f, -1.0f)));
                if (f10.floatValue() < 0.0f) {
                    wbVar10.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                wb wbVar11 = this.b;
                if (wbVar11.G1 != null) {
                    mb mbVar = wbVar11.Y0;
                    if (!mbVar.K1) {
                        mbVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                wbVar11.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            wbVar11.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        wbVar11.u();
                                        wbVar11.H();
                                        ya yaVar = wbVar11.r1;
                                        if (yaVar != null) {
                                            yaVar.R0(1);
                                            yaVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    wbVar11.l0(0, false, true);
                                    ya yaVar2 = wbVar11.r1;
                                    if (yaVar2 != null) {
                                        yaVar2.R0(2);
                                        yaVar2.h2 = true;
                                        yaVar2.o0(true);
                                        wbVar11.r1.I0 = true;
                                        break;
                                    }
                                }
                            } else {
                                wbVar11.l0(0, false, true);
                                ya yaVar3 = wbVar11.r1;
                                if (yaVar3 != null) {
                                    yaVar3.I0 = false;
                                    yaVar3.R0(0);
                                    yaVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            wbVar11.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                wb wbVar12 = this.b;
                FrameLayout frameLayout = wbVar12.U0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(wbVar12.c0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + wbVar12.Y0.getEditTextHeight())));
                }
                na naVar2 = wbVar12.Z0;
                if (naVar2 != null) {
                    int i13 = -(AndroidUtilities.dp(24.0f) + wbVar12.Y0.getEditTextHeight());
                    naVar2.setTranslationY(i13 - (wbVar12.V0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                org.telegram.ui.Components.gc gcVar3 = org.telegram.ui.Components.gc.w;
                if (gcVar3 != null && gcVar3.a == 2) {
                    gcVar3.l();
                }
                if (wbVar12.Y0.l0 && (naVar = wbVar12.Z0) != null) {
                    naVar.c(false, true);
                    break;
                }
                break;
            case 14:
                r9 r9Var = (r9) obj;
                wb wbVar13 = this.b;
                a8 a8Var4 = wbVar13.G1;
                if (a8Var4 != null) {
                    a8Var4.E0 = r9Var;
                }
                ArrayList arrayList3 = wbVar13.D1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj2 = arrayList3.get(i14);
                        i14++;
                        ((a8) obj2).E0 = r9Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                wb wbVar14 = this.b;
                a8 a8Var5 = wbVar14.G1;
                if (a8Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    a8Var5.v0 = inputPeer;
                    ArrayList arrayList4 = wbVar14.D1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj3 = arrayList4.get(i15);
                            i15++;
                            ((a8) obj3).v0 = wbVar14.G1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                wb wbVar15 = this.b;
                a8 a8Var6 = wbVar15.G1;
                if (a8Var6 != null) {
                    a8Var6.w0 = hashSet;
                    ArrayList arrayList5 = wbVar15.D1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            Object obj4 = arrayList5.get(i16);
                            i16++;
                            ((a8) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                wb wbVar16 = this.b;
                a8 a8Var7 = wbVar16.G1;
                if (a8Var7 != null) {
                    Bitmap bitmap3 = a8Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    wbVar16.G1.g0 = bitmap2;
                    t9 t9Var2 = wbVar16.m0;
                    if (t9Var2 != null) {
                        t9Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.u0 = (r9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                wb wbVar17 = this.b;
                t7 t7Var = wbVar17.k0;
                wbVar17.t0 = inputPeer2;
                t7Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                wb wbVar18 = this.b;
                t7 t7Var2 = wbVar18.k0;
                wbVar18.t0 = inputPeer3;
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
