package jh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.av0;
import org.telegram.ui.gz0;
import org.telegram.ui.hh1;
import org.telegram.ui.hp0;
import org.telegram.ui.hz0;
import org.telegram.ui.lp0;
import org.telegram.ui.mg0;
import org.telegram.ui.ng0;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ug1;
import org.telegram.ui.ul0;
import org.telegram.ui.v70;
import org.telegram.ui.vm0;
import org.telegram.ui.x70;
import org.telegram.ui.zo0;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 2;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                i1 i1Var = ((j1) obj).f0;
                int i16 = i1.s;
                i1Var.a(i15);
                break;
            case 1:
                ((i1) obj).a(i15);
                break;
            case 2:
                nh.y9 y9Var = (nh.y9) obj;
                if (!y9Var.e.contains(Integer.valueOf(i15))) {
                    y9Var.e.add(Integer.valueOf(i15));
                } else if (y9Var.e.size() > 1) {
                    y9Var.e.remove(Integer.valueOf(i15));
                }
                AndroidUtilities.forEachViews((RecyclerView) y9Var.b, (f5.d) new kg.i(y9Var, i12));
                break;
            case 3:
                nh.w5 w5Var = ((nh.u5) obj).b;
                if (w5Var.r && (callback = w5Var.f) != null) {
                    callback.run(Integer.valueOf(i15));
                    break;
                }
                break;
            case 4:
                ((tn) obj).G9(i15);
                break;
            case 5:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i15 == 0) {
                    i0Var.Z = !i0Var.Z;
                } else if (i15 == 1) {
                    i0Var.a0 = !i0Var.a0;
                } else if (i15 == 2) {
                    i0Var.b0 = !i0Var.b0;
                }
                i0Var.T.N(true);
                i0Var.s();
                break;
            case 6:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.b.T0.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 8:
                ((i30) obj).b.x(i15, true);
                break;
            case 9:
                i30 i30Var = ((h30) obj).c;
                i30Var.n(i15);
                i30Var.dismiss();
                break;
            case 10:
                zc0 zc0Var = (zc0) obj;
                if (zc0Var.e.getAdapter() instanceof xc0) {
                    fz fzVar = ((xx) ((xc0) zc0Var.e.getAdapter())).c;
                    if ((i15 != 1 && i15 != 2) || !fzVar.s1) {
                        if (i15 == 0 && fzVar.r1) {
                            fzVar.R(true, true, false);
                            break;
                        }
                    } else {
                        fzVar.R(true, false, i15 == 1);
                        break;
                    }
                }
                zc0Var.e.x(i15, false);
                break;
            case 11:
                org.telegram.ui.Components.o4 o4Var = (org.telegram.ui.Components.o4) obj;
                EditTextBoldCursor editTextBoldCursor = o4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                o4Var.d.run(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                o4Var.dismiss();
                break;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i15, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 13:
                c61 c61Var = (c61) obj;
                int i17 = c61Var.b.i.q;
                if (i17 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    c61Var.updateAppUpdateViews(i15, true);
                    break;
                } else if (i17 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    c61Var.updateAppUpdateViews(i15, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", c61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 14:
                ((org.telegram.ui.Components.voip.v0) obj).b.x(i15, true);
                break;
            case 15:
                hh1 hh1Var = (hh1) obj;
                if (hh1Var.Q == null && view.getAlpha() != 0.0f) {
                    hh1Var.c(i15, true);
                    break;
                }
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 17:
                x70 x70Var = (x70) obj;
                x70Var.M.dismiss();
                int i18 = x70Var.V;
                if (i18 >= 0) {
                    x70Var.W.setKeepMedia(i18, i15);
                    v70 v70Var = x70Var.a0;
                    if (v70Var != null) {
                        v70Var.a(i15);
                        break;
                    }
                } else {
                    v70 v70Var2 = x70Var.a0;
                    if (v70Var2 != null) {
                        v70Var2.a(i15);
                        break;
                    }
                }
                break;
            case 18:
                ng0 ng0Var = (ng0) obj;
                ValueAnimator valueAnimator = ng0Var.c.M;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ug1 ug1Var = ng0Var.c;
                    if (!ug1Var.D) {
                        if (ug1Var.getCurrentPosition() == i15) {
                            Object X = ng0Var.X();
                            if (X instanceof mg0) {
                                ((mg0) X).s();
                                break;
                            }
                        } else {
                            ng0Var.m0(i15, true);
                            ng0Var.c.D(i15);
                            break;
                        }
                    }
                }
                break;
            case 19:
                vm0 vm0Var = (vm0) obj;
                ul0 ul0Var = vm0Var.z1;
                vm0Var.O0 = i15;
                if (i15 == 1) {
                    vm0Var.e0 = vm0Var.c0;
                } else if (i15 == 4) {
                    vm0Var.e0 = vm0Var.d0;
                } else if (i15 == 2) {
                    vm0Var.e0 = vm0Var.a0;
                } else if (i15 == 3) {
                    vm0Var.e0 = vm0Var.b0;
                } else {
                    vm0Var.e0 = vm0Var.Z;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, vm0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(vm0Var.f1);
                    PhotoViewer.t1().b2(arrayList, 0, ul0Var);
                    break;
                } else if (i15 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(vm0Var.h1);
                    PhotoViewer.t1().b2(arrayList2, 0, ul0Var);
                    break;
                } else if (i15 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(vm0Var.i1);
                    PhotoViewer.t1().b2(arrayList3, 0, ul0Var);
                    break;
                } else if (i15 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = vm0Var.e1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), ul0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = vm0Var.g1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), ul0Var);
                    break;
                }
            case 20:
                hp0 hp0Var = (hp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = hp0Var.E;
                if (o1Var != null && o1Var.isShowing()) {
                    hp0Var.E.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.c5.L(hp0Var.getParentActivity(), hp0Var.B.a(), new zo0(hp0Var, i13));
                    break;
                } else {
                    hp0Var.V(hp0Var.b, hp0Var.c, true, 0);
                    hp0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                zp0 zp0Var = (zp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = zp0Var.i0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    zp0Var.i0.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.c5.L(zp0Var.getParentActivity(), zp0Var.Q.a(), new lp0(zp0Var, i14));
                    break;
                } else {
                    zp0Var.e0(0, true);
                    break;
                }
                break;
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                int i19 = PopupNotificationActivity.X;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i15).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i15 == 0) {
                    hz0 hz0Var = profileActivity.K;
                    if (!hz0Var.y1) {
                        if (qu0.w0(hz0Var.getClosestTab())) {
                            hz0 hz0Var2 = profileActivity.K;
                            profileActivity.K.O0(profileActivity, profileActivity.a(), hz0Var2.h1(hz0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            gb E = gb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new gz0(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!qu0.w0(profileActivity.K.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.v8 v8Var = profileActivity.t5;
                    if (v8Var != null) {
                        v8Var.run();
                        profileActivity.t5 = null;
                    }
                    mc.e();
                    boolean z12 = profileActivity.K.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i10 = 0;
                        for (int i20 = 0; i20 < actionModeSelected.size(); i20++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i20).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                                i10++;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    profileActivity.K.L(false);
                    if (z12) {
                        profileActivity.K.Y0(8);
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList6.size()];
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i21);
                            zArr2[i21] = storyItem2.pinned;
                            storyItem2.pinned = z12;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z13 = z12;
                        profileActivity.t5 = new org.telegram.messenger.v8(profileActivity, clientUserId, arrayList6, z13, 9);
                        ih.h1 h1Var = new ih.h1(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 15);
                        (z13 ? tc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), h1Var).j() : tc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, h1Var).j()).v = new av0(15, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    hz0 hz0Var3 = profileActivity.K;
                    int h12 = hz0Var3.h1(hz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.v8 v8Var2 = profileActivity.t5;
                    if (v8Var2 != null) {
                        v8Var2.run();
                        profileActivity.t5 = null;
                    }
                    mc.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i22 = 0; i22 < actionModeSelected2.size(); i22++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i22).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.K.L(false);
                    if (!arrayList7.isEmpty()) {
                        x8 x8Var = new x8(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        tc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), x8Var).j();
                        break;
                    }
                }
                break;
            case 24:
                t91 t91Var = (t91) obj;
                t91Var.e0.D(i15);
                t91Var.m0(i15, true);
                break;
            case 25:
                ((th.x1) obj).L.Y3(i15);
                break;
            case 26:
                View.OnClickListener onClickListener = ((ug.e) obj).b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                ug.a aVar = ((ug.g) obj).h;
                if (aVar != null) {
                    aVar.k(i15);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y0(MessageObject messageObject, int i10) {
        this.a = 22;
        this.b = i10;
        this.c = messageObject;
    }
}
