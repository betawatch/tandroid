package bi;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
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
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.y61;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br0;
import org.telegram.ui.cq0;
import org.telegram.ui.eh0;
import org.telegram.ui.eo;
import org.telegram.ui.ey0;
import org.telegram.ui.fb1;
import org.telegram.ui.fh0;
import org.telegram.ui.fi1;
import org.telegram.ui.kq0;
import org.telegram.ui.n80;
import org.telegram.ui.nm0;
import org.telegram.ui.on0;
import org.telegram.ui.oq0;
import org.telegram.ui.p80;
import org.telegram.ui.q01;
import org.telegram.ui.r01;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j5(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                oc ocVar = (oc) obj;
                if (!ocVar.e.contains(Integer.valueOf(i15))) {
                    ocVar.e.add(Integer.valueOf(i15));
                } else if (ocVar.e.size() > 1) {
                    ocVar.e.remove(Integer.valueOf(i15));
                }
                AndroidUtilities.forEachViews((RecyclerView) ocVar.b, (e2.h) new i5(ocVar, i13));
                break;
            case 1:
                v7 v7Var = ((t7) obj).b;
                if (v7Var.r && (callback = v7Var.f) != null) {
                    callback.run(Integer.valueOf(i15));
                    break;
                }
                break;
            case 2:
                ((hi.g2) obj).P.X3(i15);
                break;
            case 3:
                View.OnClickListener onClickListener = ((ih.e) obj).b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 4:
                ih.a aVar = ((ih.h) obj).h;
                if (aVar != null) {
                    aVar.i(i15);
                    break;
                }
                break;
            case 5:
                ((eo) obj).G9(i15);
                break;
            case 6:
                org.telegram.ui.Components.i0 i0Var = (org.telegram.ui.Components.i0) obj;
                if (i15 == 0) {
                    i0Var.d0 = !i0Var.d0;
                } else if (i15 == 1) {
                    i0Var.e0 = !i0Var.e0;
                } else if (i15 == 2) {
                    i0Var.f0 = !i0Var.f0;
                }
                i0Var.X.N(true);
                i0Var.s();
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i15];
                zArr[i15] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                break;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.X0.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 9:
                ((v30) obj).b.x(i15, true);
                break;
            case 10:
                v30 v30Var = ((u30) obj).c;
                v30Var.n(i15);
                v30Var.dismiss();
                break;
            case 11:
                nd0 nd0Var = (nd0) obj;
                if (nd0Var.e.getAdapter() instanceof kd0) {
                    rz rzVar = ((ky) ((kd0) nd0Var.e.getAdapter())).c;
                    if ((i15 != 1 && i15 != 2) || !rzVar.w1) {
                        if (i15 == 0 && rzVar.v1) {
                            rzVar.R(true, true, false);
                            break;
                        }
                    } else {
                        rzVar.R(true, false, i15 == 1);
                        break;
                    }
                }
                nd0Var.e.x(i15, false);
                break;
            case 12:
                org.telegram.ui.Components.p4 p4Var = (org.telegram.ui.Components.p4) obj;
                EditTextBoldCursor editTextBoldCursor = p4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                p4Var.d.run(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                p4Var.dismiss();
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i15, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 14:
                y61 y61Var = (y61) obj;
                int i16 = y61Var.b.i.q;
                if (i16 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    y61Var.updateAppUpdateViews(i15, true);
                    break;
                } else if (i16 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    y61Var.updateAppUpdateViews(i15, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", y61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.w0) obj).b.x(i15, true);
                break;
            case 16:
                si1 si1Var = (si1) obj;
                if (si1Var.U == null && view.getAlpha() != 0.0f) {
                    si1Var.c(i15, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i17 = p80Var.c0;
                if (i17 >= 0) {
                    p80Var.d0.setKeepMedia(i17, i15);
                    n80 n80Var = p80Var.e0;
                    if (n80Var != null) {
                        n80Var.a(i15);
                        break;
                    }
                } else {
                    n80 n80Var2 = p80Var.e0;
                    if (n80Var2 != null) {
                        n80Var2.a(i15);
                        break;
                    }
                }
                break;
            case 19:
                fh0 fh0Var = (fh0) obj;
                ValueAnimator valueAnimator = fh0Var.c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    fi1 fi1Var = fh0Var.c;
                    if (!fi1Var.H) {
                        if (fi1Var.getCurrentPosition() == i15) {
                            Object X = fh0Var.X();
                            if (X instanceof eh0) {
                                ((eh0) X).r();
                                break;
                            }
                        } else {
                            fh0Var.m0(i15, true);
                            fh0Var.c.D(i15);
                            break;
                        }
                    }
                }
                break;
            case 20:
                on0 on0Var = (on0) obj;
                nm0 nm0Var = on0Var.D1;
                on0Var.S0 = i15;
                if (i15 == 1) {
                    on0Var.i0 = on0Var.g0;
                } else if (i15 == 4) {
                    on0Var.i0 = on0Var.h0;
                } else if (i15 == 2) {
                    on0Var.i0 = on0Var.e0;
                } else if (i15 == 3) {
                    on0Var.i0 = on0Var.f0;
                } else {
                    on0Var.i0 = on0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, on0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(on0Var.j1);
                    PhotoViewer.t1().b2(arrayList, 0, nm0Var);
                    break;
                } else if (i15 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(on0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, nm0Var);
                    break;
                } else if (i15 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(on0Var.m1);
                    PhotoViewer.t1().b2(arrayList3, 0, nm0Var);
                    break;
                } else if (i15 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = on0Var.i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), nm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = on0Var.k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), nm0Var);
                    break;
                }
            case 21:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = kq0Var.I;
                if (p1Var != null && p1Var.isShowing()) {
                    kq0Var.I.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.d5.L(kq0Var.getParentActivity(), kq0Var.F.a(), new cq0(kq0Var, i12));
                    break;
                } else {
                    kq0Var.V(kq0Var.b, kq0Var.c, true, 0);
                    kq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                br0 br0Var = (br0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = br0Var.m0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    br0Var.m0.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.d5.L(br0Var.getParentActivity(), br0Var.U.a(), new oq0(br0Var, i14));
                    break;
                } else {
                    br0Var.e0(0, true);
                    break;
                }
                break;
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i18 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i15).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i15 == 0) {
                    r01 r01Var = profileActivity.O;
                    if (!r01Var.C1) {
                        if (iv0.w0(r01Var.getClosestTab())) {
                            r01 r01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), r01Var2.h1(r01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ce E = ce.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new q01(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!iv0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.a9 a9Var = profileActivity.x5;
                    if (a9Var != null) {
                        a9Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.pc.e();
                    int i19 = 9;
                    boolean z12 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
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
                    profileActivity.O.L(false);
                    if (z12) {
                        profileActivity.O.Y0(8);
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
                        profileActivity.x5 = new org.telegram.messenger.a9(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.g gVar = new org.telegram.messenger.voip.g(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.wc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), gVar).j() : org.telegram.ui.Components.wc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, gVar).j()).v = new ey0(i19, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    r01 r01Var3 = profileActivity.O;
                    int h12 = r01Var3.h1(r01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.a9 a9Var2 = profileActivity.x5;
                    if (a9Var2 != null) {
                        a9Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.pc.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i22 = 0; i22 < actionModeSelected2.size(); i22++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i22).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList7.isEmpty()) {
                        org.telegram.messenger.p7 p7Var = new org.telegram.messenger.p7(profileActivity, a2, h12, arrayList7, 13);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.wc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), p7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                fb1 fb1Var = (fb1) obj;
                fb1Var.i0.D(i15);
                fb1Var.m0(i15, true);
                break;
            case 26:
                xh.r0 r0Var = ((xh.s0) obj).j0;
                int i23 = xh.r0.s;
                r0Var.a(i15);
                break;
            default:
                ((xh.r0) obj).a(i15);
                break;
        }
    }

    public /* synthetic */ j5(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
