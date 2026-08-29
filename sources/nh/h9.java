package nh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ h9(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        qb qbVar;
        y9 y9Var;
        switch (this.a) {
            case 0:
                p2 p2Var = this.b.s;
                p2Var.p = ((Float) obj).floatValue();
                p2Var.i();
                break;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                gb gbVar = this.b;
                o7 o7Var = gbVar.G1;
                if (o7Var != null) {
                    AndroidUtilities.recycleBitmap(o7Var.g0);
                    gbVar.G1.g0 = bitmap;
                    e9 e9Var = gbVar.m0;
                    if (e9Var != null) {
                        e9Var.n1(bitmap);
                        break;
                    }
                }
                break;
            case 2:
                o7 o7Var2 = (o7) obj;
                gb gbVar2 = this.b;
                gbVar2.W(o7Var2, false);
                int i10 = gbVar2.c;
                lh.s6 storiesController = MessagesController.getInstance(i10).getStoriesController();
                a0.h hVar = storiesController.e;
                int i11 = storiesController.a;
                ArrayList arrayList = storiesController.h;
                ArrayList arrayList2 = storiesController.g;
                lh.r6 r6Var = new lh.r6(storiesController, o7Var2);
                boolean z11 = o7Var2.g;
                long j10 = r6Var.F;
                if (z11) {
                    HashMap hashMap = (HashMap) hVar.f(j10);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        hVar.k(hashMap, j10);
                    }
                    hashMap.put(Integer.valueOf(o7Var2.f), r6Var);
                } else {
                    storiesController.d(j10, r6Var, storiesController.b, false);
                }
                storiesController.d(j10, r6Var, storiesController.c, true);
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
                r6Var.d();
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                if (o7Var2.c && !o7Var2.g) {
                    MessagesController.getInstance(i10).getStoriesController().w.c(o7Var2);
                }
                if (o7Var2.e1 != 0) {
                    ConnectionsManager.getInstance(o7Var2.a).cancelRequest(o7Var2.e1, true);
                    break;
                }
                break;
            case 3:
                h6 h6Var = (h6) obj;
                gb gbVar3 = this.b;
                if (gbVar3.y0 != null) {
                    gbVar3.z0.setLink(h6Var == null ? null : h6Var.a);
                    ua uaVar = gbVar3.w0;
                    if (uaVar != null) {
                        uaVar.c.a(gbVar3.z0.y ? gbVar3.y0.d : null);
                        break;
                    }
                }
                break;
            case 4:
                Integer num = (Integer) obj;
                o7 o7Var3 = this.b.G1;
                if (o7Var3 != null) {
                    o7Var3.I0 = num.intValue();
                    MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
                    break;
                }
                break;
            case 5:
                gb gbVar4 = this.b;
                lh.b bVar = gbVar4.a;
                int intValue = ((Integer) obj).intValue() / 3600;
                org.telegram.ui.Components.gb gbVar5 = new org.telegram.ui.Components.hb(gbVar4.b, new eg.x(5)).a;
                WindowManager.LayoutParams layout = gbVar5.getLayout();
                if (layout != null) {
                    layout.height = -2;
                    layout.width = gbVar4.r.getWidth();
                    layout.y = (int) (gbVar4.r.getY() + AndroidUtilities.dp(56.0f));
                    org.telegram.ui.Components.hb hbVar = gbVar5.a;
                    hbVar.getWindow().setAttributes(hbVar.b);
                }
                gbVar5.setTouchable(true);
                new tc(gbVar5, bVar).G(R.raw.fire_on, 3, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryPeriodPremium", intValue, new Object[0]), org.telegram.ui.ActionBar.g6.gc, 0, new g9(gbVar4, 27), bVar)).k(true);
                break;
            case 6:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                gb gbVar6 = this.b;
                if (booleanValue && (qbVar = gbVar6.V0) != null && qbVar.L) {
                    qbVar.L = false;
                    if (qbVar.A && qbVar.h == null) {
                        qbVar.C = true;
                        kb kbVar = qbVar.a;
                        if (kbVar != null) {
                            kbVar.d1(true);
                        }
                    }
                }
                gbVar6.T0.x(2, bool.booleanValue());
                gbVar6.U0.clearAnimation();
                gbVar6.U0.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
                mc mcVar = mc.w;
                if (mcVar != null && mcVar.a == 2) {
                    mcVar.l();
                    break;
                }
                break;
            case 7:
                gb gbVar7 = this.b;
                gbVar7.l();
                gbVar7.m();
                gbVar7.i((Runnable) obj);
                break;
            case 8:
                t tVar = (t) obj;
                gb gbVar8 = this.b;
                ua uaVar2 = gbVar8.w0;
                gbVar8.v0 = tVar;
                uaVar2.o(tVar);
                gbVar8.E0.setSelected(tVar);
                ka kaVar = gbVar8.x0;
                if (kaVar != null) {
                    kaVar.recordHevc = !gbVar8.w0.j();
                }
                gbVar8.C0.setDrawable(new u(tVar, false));
                gbVar8.c0(gbVar8.D0, gbVar8.E0.e, true);
                gbVar8.K0.e(gbVar8.w0.j() ? gbVar8.w0.getFilledProgress() : 0.0f, true);
                ga gaVar = gbVar8.I0;
                if (gaVar != null) {
                    gaVar.setMultipleOnClick(gbVar8.w0.j());
                    gbVar8.I0.setMaxCount(Math.min(10, t.b() - gbVar8.w0.getFilledCount()));
                    break;
                }
                break;
            case 9:
                gb gbVar9 = this.b;
                gbVar9.K = true;
                gbVar9.q(true);
                AndroidUtilities.runOnUIThread(new eg.o0(3, (Utilities.Callback) obj), 210L);
                break;
            case 10:
                Integer num2 = (Integer) obj;
                gb gbVar10 = this.b;
                if (!gbVar10.L1 && !gbVar10.M1) {
                    int intValue2 = num2.intValue();
                    gbVar10.K1 = intValue2;
                    gbVar10.k0.a(intValue2 == -1, true);
                    gbVar10.i0(gbVar10.K1 == 1 && !gbVar10.E0.e, true);
                    gbVar10.M0.a(num2.intValue());
                    o6 o6Var = gbVar10.K0;
                    boolean z12 = num2.intValue() == 1;
                    o6Var.j0 = -1.0f;
                    o6Var.k0 = z12;
                    o6Var.invalidate();
                    if (num2.intValue() == -1) {
                        ka kaVar2 = gbVar10.x0;
                        if (kaVar2 != null && kaVar2.isDual()) {
                            gbVar10.x0.toggleDual();
                        }
                        t3 t3Var = gbVar10.h1;
                        if (t3Var != null) {
                            t3Var.e(true);
                        }
                        t3 t3Var2 = gbVar10.i1;
                        if (t3Var2 != null) {
                            t3Var2.e(true);
                        }
                        t3 t3Var3 = gbVar10.S0;
                        if (t3Var3 != null) {
                            t3Var3.e(true);
                        }
                        gbVar10.w0.o(null);
                        gbVar10.w0.e();
                        gbVar10.E0.setSelected((t) null);
                        ka kaVar3 = gbVar10.x0;
                        if (kaVar3 != null) {
                            kaVar3.recordHevc = !gbVar10.w0.j();
                        }
                    }
                    gbVar10.E0.a(false, true);
                    gbVar10.m0(true);
                    break;
                }
                break;
            case 11:
                Float f9 = (Float) obj;
                gb gbVar11 = this.b;
                o6 o6Var2 = gbVar11.K0;
                o6Var2.j0 = f9.floatValue();
                o6Var2.invalidate();
                gbVar11.K0.setVisibility(f9.floatValue() <= -1.0f ? 8 : 0);
                gbVar11.K0.setAlpha(Utilities.clamp01(f9.floatValue() + 1.0f));
                gbVar11.L0.setVisibility(f9.floatValue() < 0.0f ? 0 : 8);
                gbVar11.L0.setAlpha(AndroidUtilities.ilerp(f9.floatValue(), 0.0f, -1.0f));
                gbVar11.L0.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f9.floatValue(), 0.0f, -1.0f)));
                gbVar11.L0.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f9.floatValue(), 0.0f, -1.0f)));
                gbVar11.L0.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f9.floatValue(), 0.0f, -1.0f)));
                if (f9.floatValue() < 0.0f) {
                    gbVar11.f(false);
                    break;
                }
                break;
            case 12:
                Integer num3 = (Integer) obj;
                gb gbVar12 = this.b;
                if (gbVar12.G1 != null) {
                    wa waVar = gbVar12.Y0;
                    if (!waVar.K1) {
                        waVar.clearFocus();
                        if (num3.intValue() != 5) {
                            if (num3.intValue() != 0) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 2) {
                                        if (num3.intValue() != 4) {
                                            if (num3.intValue() == 3) {
                                                gbVar12.l0(3, false, true);
                                                break;
                                            }
                                        } else {
                                            gbVar12.l0(1, false, true);
                                            break;
                                        }
                                    } else {
                                        gbVar12.u();
                                        gbVar12.H();
                                        ja jaVar = gbVar12.r1;
                                        if (jaVar != null) {
                                            jaVar.R0(1);
                                            jaVar.A0();
                                            break;
                                        }
                                    }
                                } else {
                                    gbVar12.l0(0, false, true);
                                    ja jaVar2 = gbVar12.r1;
                                    if (jaVar2 != null) {
                                        jaVar2.R0(2);
                                        jaVar2.h2 = true;
                                        jaVar2.o0(true);
                                        gbVar12.r1.I0 = true;
                                        break;
                                    }
                                }
                            } else {
                                gbVar12.l0(0, false, true);
                                ja jaVar3 = gbVar12.r1;
                                if (jaVar3 != null) {
                                    jaVar3.I0 = false;
                                    jaVar3.R0(0);
                                    jaVar3.D0(null, true);
                                    break;
                                }
                            }
                        } else {
                            gbVar12.X();
                            break;
                        }
                    }
                }
                break;
            case 13:
                gb gbVar13 = this.b;
                FrameLayout frameLayout = gbVar13.U0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(gbVar13.c0 == 2 ? AndroidUtilities.dp(68.0f) : AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + gbVar13.Y0.getEditTextHeight())));
                }
                y9 y9Var2 = gbVar13.Z0;
                if (y9Var2 != null) {
                    int i14 = -(AndroidUtilities.dp(24.0f) + gbVar13.Y0.getEditTextHeight());
                    y9Var2.setTranslationY(i14 - (gbVar13.V0 == null ? 0 : r6.getContentHeight() - AndroidUtilities.dp(5.0f)));
                }
                mc mcVar2 = mc.w;
                if (mcVar2 != null && mcVar2.a == 2) {
                    mcVar2.l();
                }
                if (gbVar13.Y0.l0 && (y9Var = gbVar13.Z0) != null) {
                    y9Var.c(false, true);
                    break;
                }
                break;
            case 14:
                c9 c9Var = (c9) obj;
                gb gbVar14 = this.b;
                o7 o7Var4 = gbVar14.G1;
                if (o7Var4 != null) {
                    o7Var4.E0 = c9Var;
                }
                ArrayList arrayList3 = gbVar14.D1;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList3.get(i15);
                        i15++;
                        ((o7) obj2).E0 = c9Var;
                    }
                    break;
                }
                break;
            case 15:
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                gb gbVar15 = this.b;
                o7 o7Var5 = gbVar15.G1;
                if (o7Var5 != null) {
                    if (inputPeer == null) {
                        inputPeer = new TLRPC.TL_inputPeerSelf();
                    }
                    o7Var5.v0 = inputPeer;
                    ArrayList arrayList4 = gbVar15.D1;
                    if (arrayList4 != null) {
                        int size2 = arrayList4.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList4.get(i16);
                            i16++;
                            ((o7) obj3).v0 = gbVar15.G1.v0;
                        }
                        break;
                    }
                }
                break;
            case 16:
                HashSet hashSet = (HashSet) obj;
                gb gbVar16 = this.b;
                o7 o7Var6 = gbVar16.G1;
                if (o7Var6 != null) {
                    o7Var6.w0 = hashSet;
                    ArrayList arrayList5 = gbVar16.D1;
                    if (arrayList5 != null) {
                        int size3 = arrayList5.size();
                        int i17 = 0;
                        while (i17 < size3) {
                            Object obj4 = arrayList5.get(i17);
                            i17++;
                            ((o7) obj4).w0 = hashSet;
                        }
                        break;
                    }
                }
                break;
            case 17:
                Bitmap bitmap2 = (Bitmap) obj;
                gb gbVar17 = this.b;
                o7 o7Var7 = gbVar17.G1;
                if (o7Var7 != null) {
                    Bitmap bitmap3 = o7Var7.g0;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    gbVar17.G1.g0 = bitmap2;
                    e9 e9Var2 = gbVar17.m0;
                    if (e9Var2 != null) {
                        e9Var2.n1(bitmap2);
                        break;
                    }
                }
                break;
            case 18:
                this.b.u0 = (c9) obj;
                break;
            case 19:
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) obj;
                gb gbVar18 = this.b;
                h7 h7Var = gbVar18.k0;
                gbVar18.t0 = inputPeer2;
                h7Var.set(inputPeer2);
                break;
            case 20:
                TLRPC.InputPeer inputPeer3 = (TLRPC.InputPeer) obj;
                gb gbVar19 = this.b;
                h7 h7Var2 = gbVar19.k0;
                gbVar19.t0 = inputPeer3;
                h7Var2.set(inputPeer3);
                break;
            default:
                p2 p2Var2 = this.b.s;
                float floatValue = ((Float) obj).floatValue();
                p2Var2.o = floatValue;
                p2Var2.n = p2.f(floatValue);
                p2Var2.g();
                break;
        }
    }
}
