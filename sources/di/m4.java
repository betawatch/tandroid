package di;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hb1;
import org.telegram.ui.hq0;
import org.telegram.ui.hr0;
import org.telegram.ui.hz0;
import org.telegram.ui.ii1;
import org.telegram.ui.jh0;
import org.telegram.ui.kh0;
import org.telegram.ui.m50;
import org.telegram.ui.q01;
import org.telegram.ui.qq0;
import org.telegram.ui.r01;
import org.telegram.ui.r80;
import org.telegram.ui.sm0;
import org.telegram.ui.t80;
import org.telegram.ui.un0;
import org.telegram.ui.uq0;
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(Object obj, int i10, int i11) {
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
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                bb bbVar = (bb) obj;
                if (!bbVar.e.contains(Integer.valueOf(i14))) {
                    bbVar.e.add(Integer.valueOf(i14));
                } else if (bbVar.e.size() > 1) {
                    bbVar.e.remove(Integer.valueOf(i14));
                }
                AndroidUtilities.forEachViews((RecyclerView) bbVar.b, (Utilities.Callback<View>) new bi.o1(bbVar, 10));
                break;
            case 1:
                s6 s6Var = ((q6) obj).b;
                if (s6Var.r && (callback = s6Var.f) != null) {
                    callback.run(Integer.valueOf(i14));
                    break;
                }
                break;
            case 2:
                ((ji.d2) obj).P.Z3(i14);
                break;
            case 3:
                View.OnClickListener onClickListener = ((kh.e) obj).b[i14];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 4:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i14);
                    break;
                }
                break;
            case 5:
                ((fo) obj).L9(i14);
                break;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i14 == 0) {
                    g0Var.d0 = !g0Var.d0;
                } else if (i14 == 1) {
                    g0Var.e0 = !g0Var.e0;
                } else if (i14 == 2) {
                    g0Var.f0 = !g0Var.f0;
                }
                g0Var.X.N(true);
                g0Var.u();
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                break;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.a1.getActionBarMenuOnItemClick().b(i14);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 9:
                ((m50) obj).b.x(i14, true);
                break;
            case 10:
                m50 m50Var = ((x30) obj).c;
                m50Var.o(i14);
                m50Var.dismiss();
                break;
            case 11:
                de0 de0Var = (de0) obj;
                if (de0Var.e.getAdapter() instanceof be0) {
                    wz wzVar = ((py) ((be0) de0Var.e.getAdapter())).c;
                    if ((i14 != 1 && i14 != 2) || !wzVar.w1) {
                        if (i14 == 0 && wzVar.v1) {
                            wzVar.P(true, true, false);
                            break;
                        }
                    } else {
                        wzVar.P(true, false, i14 == 1);
                        break;
                    }
                }
                de0Var.e.x(i14, false);
                break;
            case 12:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj;
                EditTextBoldCursor editTextBoldCursor = s4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                s4Var.d.run(Integer.valueOf(i14), editTextBoldCursor.getText().toString());
                s4Var.dismiss();
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i14, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 14:
                n71 n71Var = (n71) obj;
                int i15 = n71Var.b.i.q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    n71Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    n71Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", n71Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.v0) obj).b.x(i14, true);
                break;
            case 16:
                wi1 wi1Var = (wi1) obj;
                if (wi1Var.U == null && view.getAlpha() != 0.0f) {
                    wi1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                t80 t80Var = (t80) obj;
                t80Var.Q.dismiss();
                int i16 = t80Var.c0;
                if (i16 >= 0) {
                    t80Var.d0.setKeepMedia(i16, i14);
                    r80 r80Var = t80Var.e0;
                    if (r80Var != null) {
                        r80Var.a(i14);
                        break;
                    }
                } else {
                    r80 r80Var2 = t80Var.e0;
                    if (r80Var2 != null) {
                        r80Var2.a(i14);
                        break;
                    }
                }
                break;
            case 19:
                kh0 kh0Var = (kh0) obj;
                ValueAnimator valueAnimator = kh0Var.c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ii1 ii1Var = kh0Var.c;
                    if (!ii1Var.H) {
                        if (ii1Var.getCurrentPosition() == i14) {
                            Object X = kh0Var.X();
                            if (X instanceof jh0) {
                                ((jh0) X).t();
                                break;
                            }
                        } else {
                            kh0Var.m0(i14, true);
                            kh0Var.c.D(i14);
                            break;
                        }
                    }
                }
                break;
            case 20:
                un0 un0Var = (un0) obj;
                sm0 sm0Var = un0Var.D1;
                un0Var.S0 = i14;
                if (i14 == 1) {
                    un0Var.i0 = un0Var.g0;
                } else if (i14 == 4) {
                    un0Var.i0 = un0Var.h0;
                } else if (i14 == 2) {
                    un0Var.i0 = un0Var.e0;
                } else if (i14 == 3) {
                    un0Var.i0 = un0Var.f0;
                } else {
                    un0Var.i0 = un0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, un0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(un0Var.j1);
                    PhotoViewer.t1().c2(arrayList, 0, sm0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(un0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, sm0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(un0Var.m1);
                    PhotoViewer.t1().c2(arrayList3, 0, sm0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = un0Var.i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), sm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = un0Var.k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), sm0Var);
                    break;
                }
            case 21:
                qq0 qq0Var = (qq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = qq0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    qq0Var.I.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.g5.K(qq0Var.getParentActivity(), qq0Var.F.a(), new hq0(qq0Var, i12));
                    break;
                } else {
                    qq0Var.V(qq0Var.b, qq0Var.c, true, 0);
                    qq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                hr0 hr0Var = (hr0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = hr0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    hr0Var.m0.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.g5.K(hr0Var.getParentActivity(), hr0Var.U.a(), new uq0(hr0Var, i13));
                    break;
                } else {
                    hr0Var.e0(0, true);
                    break;
                }
                break;
            case 23:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i14).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 24:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i14 == 0) {
                    r01 r01Var = profileActivity.O;
                    if (!r01Var.C1) {
                        if (xv0.w0(r01Var.getClosestTab())) {
                            r01 r01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), r01Var2.h1(r01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc D = kc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.x = new q01(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!xv0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.r8 r8Var = profileActivity.x5;
                    if (r8Var != null) {
                        r8Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.sc.e();
                    boolean z12 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i10 = 0;
                        for (int i18 = 0; i18 < actionModeSelected.size(); i18++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i18).storyItem;
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
                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i19);
                            zArr2[i19] = storyItem2.pinned;
                            storyItem2.pinned = z12;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z13 = z12;
                        profileActivity.x5 = new org.telegram.messenger.r8(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.zc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j() : org.telegram.ui.Components.zc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j()).v = new hz0(i13, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    r01 r01Var3 = profileActivity.O;
                    int h12 = r01Var3.h1(r01Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.r8 r8Var2 = profileActivity.x5;
                    if (r8Var2 != null) {
                        r8Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.sc.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i20 = 0; i20 < actionModeSelected2.size(); i20++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i20).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList7.isEmpty()) {
                        org.telegram.messenger.k7 k7Var = new org.telegram.messenger.k7(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.zc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), k7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                hb1 hb1Var = (hb1) obj;
                hb1Var.i0.D(i14);
                hb1Var.m0(i14, true);
                break;
            case 26:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                EditText editText = h9Var.a;
                TextView[] textViewArr = h9Var.N;
                TextView textView = textViewArr[i14];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i14].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    h9Var.a();
                    h9Var.a();
                    Runnable runnable = h9Var.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
            case 27:
                zh.q0 q0Var = ((zh.r0) obj).j0;
                int i21 = zh.q0.s;
                q0Var.a(i14);
                break;
            default:
                ((zh.q0) obj).a(i14);
                break;
        }
    }

    public /* synthetic */ m4(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
