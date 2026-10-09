package ci;

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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.ty;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.bi1;
import org.telegram.ui.bq0;
import org.telegram.ui.br0;
import org.telegram.ui.eh0;
import org.telegram.ui.f50;
import org.telegram.ui.fh0;
import org.telegram.ui.j01;
import org.telegram.ui.k01;
import org.telegram.ui.kq0;
import org.telegram.ui.mm0;
import org.telegram.ui.n80;
import org.telegram.ui.nn0;
import org.telegram.ui.oq0;
import org.telegram.ui.p80;
import org.telegram.ui.pi1;
import org.telegram.ui.rt0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                cb cbVar = (cb) obj;
                if (!cbVar.e.contains(Integer.valueOf(i14))) {
                    cbVar.e.add(Integer.valueOf(i14));
                } else if (cbVar.e.size() > 1) {
                    cbVar.e.remove(Integer.valueOf(i14));
                }
                AndroidUtilities.forEachViews((RecyclerView) cbVar.b, (Utilities.Callback<View>) new ai.y1(cbVar, 10));
                break;
            case 1:
                u6 u6Var = ((s6) obj).b;
                if (u6Var.r && (callback = u6Var.f) != null) {
                    callback.run(Integer.valueOf(i14));
                    break;
                }
                break;
            case 2:
                ((ii.e2) obj).P.Z3(i14);
                break;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).b[i14];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.h(i14);
                    break;
                }
                break;
            case 5:
                ((zn) obj).L9(i14);
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
                ((f50) obj).b.x(i14, true);
                break;
            case 10:
                f50 f50Var = ((b40) obj).c;
                f50Var.p(i14);
                f50Var.dismiss();
                break;
            case 11:
                ee0 ee0Var = (ee0) obj;
                if (ee0Var.e.getAdapter() instanceof ce0) {
                    a00 a00Var = ((ty) ((ce0) ee0Var.e.getAdapter())).c;
                    if ((i14 != 1 && i14 != 2) || !a00Var.w1) {
                        if (i14 == 0 && a00Var.v1) {
                            a00Var.P(true, true, false);
                            break;
                        }
                    } else {
                        a00Var.P(true, false, i14 == 1);
                        break;
                    }
                }
                ee0Var.e.x(i14, false);
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
                q71 q71Var = (q71) obj;
                int i15 = q71Var.b.i.q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    q71Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    q71Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", q71Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i14, true);
                break;
            case 16:
                pi1 pi1Var = (pi1) obj;
                if (pi1Var.U == null && view.getAlpha() != 0.0f) {
                    pi1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                p80 p80Var = (p80) obj;
                p80Var.Q.dismiss();
                int i16 = p80Var.c0;
                if (i16 >= 0) {
                    p80Var.d0.setKeepMedia(i16, i14);
                    n80 n80Var = p80Var.e0;
                    if (n80Var != null) {
                        n80Var.a(i14);
                        break;
                    }
                } else {
                    n80 n80Var2 = p80Var.e0;
                    if (n80Var2 != null) {
                        n80Var2.a(i14);
                        break;
                    }
                }
                break;
            case 19:
                fh0 fh0Var = (fh0) obj;
                ValueAnimator valueAnimator = fh0Var.c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    bi1 bi1Var = fh0Var.c;
                    if (!bi1Var.H) {
                        if (bi1Var.getCurrentPosition() == i14) {
                            Object X = fh0Var.X();
                            if (X instanceof eh0) {
                                ((eh0) X).s();
                                break;
                            }
                        } else {
                            fh0Var.m0(i14, true);
                            fh0Var.c.D(i14);
                            break;
                        }
                    }
                }
                break;
            case 20:
                nn0 nn0Var = (nn0) obj;
                mm0 mm0Var = nn0Var.D1;
                nn0Var.S0 = i14;
                if (i14 == 1) {
                    nn0Var.i0 = nn0Var.g0;
                } else if (i14 == 4) {
                    nn0Var.i0 = nn0Var.h0;
                } else if (i14 == 2) {
                    nn0Var.i0 = nn0Var.e0;
                } else if (i14 == 3) {
                    nn0Var.i0 = nn0Var.f0;
                } else {
                    nn0Var.i0 = nn0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, nn0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(nn0Var.j1);
                    PhotoViewer.t1().c2(arrayList, 0, mm0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(nn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, mm0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(nn0Var.m1);
                    PhotoViewer.t1().c2(arrayList3, 0, mm0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = nn0Var.i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), mm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = nn0Var.k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), mm0Var);
                    break;
                }
            case 21:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = kq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    kq0Var.I.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.g5.K(kq0Var.getParentActivity(), kq0Var.F.a(), new bq0(kq0Var, i12));
                    break;
                } else {
                    kq0Var.V(kq0Var.b, kq0Var.c, true, 0);
                    kq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                br0 br0Var = (br0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = br0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    br0Var.m0.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.g5.K(br0Var.getParentActivity(), br0Var.U.a(), new oq0(br0Var, i13));
                    break;
                } else {
                    br0Var.e0(0, true);
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
                    k01 k01Var = profileActivity.O;
                    if (!k01Var.C1) {
                        if (bw0.w0(k01Var.getClosestTab())) {
                            k01 k01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), k01Var2.h1(k01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc D = lc.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.x = new j01(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!bw0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.o8 o8Var = profileActivity.x5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.tc.e();
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
                        profileActivity.x5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.ad.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j() : org.telegram.ui.Components.ad.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j()).v = new rt0(20, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    k01 k01Var3 = profileActivity.O;
                    int h12 = k01Var3.h1(k01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.o8 o8Var2 = profileActivity.x5;
                    if (o8Var2 != null) {
                        o8Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.tc.e();
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
                        org.telegram.messenger.h7 h7Var = new org.telegram.messenger.h7(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.ad.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), h7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                bb1 bb1Var = (bb1) obj;
                bb1Var.i0.D(i14);
                bb1Var.m0(i14, true);
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
                yh.q0 q0Var = ((yh.r0) obj).j0;
                int i21 = yh.q0.s;
                q0Var.a(i14);
                break;
            default:
                ((yh.q0) obj).a(i14);
                break;
        }
    }

    public /* synthetic */ m4(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
