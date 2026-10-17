package ai;

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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ch1;
import org.telegram.ui.kp0;
import org.telegram.ui.kq0;
import org.telegram.ui.lv0;
import org.telegram.ui.og0;
import org.telegram.ui.oz0;
import org.telegram.ui.pg0;
import org.telegram.ui.pg1;
import org.telegram.ui.pz0;
import org.telegram.ui.r40;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
import org.telegram.ui.tp0;
import org.telegram.ui.v70;
import org.telegram.ui.x70;
import org.telegram.ui.xl0;
import org.telegram.ui.xm0;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1(Object obj, int i10, int i11) {
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
        int i13 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                z1 z1Var = ((a2) obj).j0;
                int i14 = z1.s;
                z1Var.a(i13);
                break;
            case 1:
                ((z1) obj).a(i13);
                break;
            case 2:
                ei.ma maVar = (ei.ma) obj;
                if (!maVar.e.contains(Integer.valueOf(i13))) {
                    maVar.e.add(Integer.valueOf(i13));
                } else if (maVar.e.size() > 1) {
                    maVar.e.remove(Integer.valueOf(i13));
                }
                AndroidUtilities.forEachViews((RecyclerView) maVar.b, (Utilities.Callback<View>) new r0(maVar, 16));
                break;
            case 3:
                ei.k6 k6Var = ((ei.h6) obj).b;
                if (k6Var.r && (callback = k6Var.f) != null) {
                    callback.run(Integer.valueOf(i13));
                    break;
                }
                break;
            case 4:
                View.OnClickListener onClickListener = ((kh.e) obj).b[i13];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 5:
                kh.a aVar = ((kh.h) obj).h;
                if (aVar != null) {
                    aVar.j(i13);
                    break;
                }
                break;
            case 6:
                ((ki.d2) obj).P.Z3(i13);
                break;
            case 7:
                ((sn) obj).L9(i13);
                break;
            case 8:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i13 == 0) {
                    g0Var.d0 = !g0Var.d0;
                } else if (i13 == 1) {
                    g0Var.e0 = !g0Var.e0;
                } else if (i13 == 2) {
                    g0Var.f0 = !g0Var.f0;
                }
                g0Var.X.N(true);
                g0Var.t();
                break;
            case 9:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i13];
                zArr[i13] = z10;
                ((org.telegram.ui.Cells.a2) view).c(z10, true);
                break;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.a1.getActionBarMenuOnItemClick().b(i13);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 11:
                ((r40) obj).b.x(i13, true);
                break;
            case 12:
                r40 r40Var = ((t30) obj).c;
                r40Var.o(i13);
                r40Var.dismiss();
                break;
            case 13:
                xd0 xd0Var = (xd0) obj;
                if (xd0Var.e.getAdapter() instanceof vd0) {
                    tz tzVar = ((ly) ((vd0) xd0Var.e.getAdapter())).c;
                    if ((i13 != 1 && i13 != 2) || !tzVar.w1) {
                        if (i13 == 0 && tzVar.v1) {
                            tzVar.P(true, true, false);
                            break;
                        }
                    } else {
                        tzVar.P(true, false, i13 == 1);
                        break;
                    }
                }
                xd0Var.e.x(i13, false);
                break;
            case 14:
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) obj;
                EditTextBoldCursor editTextBoldCursor = r4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                r4Var.d.run(Integer.valueOf(i13), editTextBoldCursor.getText().toString());
                r4Var.dismiss();
                break;
            case 15:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i13, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 16:
                g71 g71Var = (g71) obj;
                int i15 = g71Var.b.i.q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    g71Var.updateAppUpdateViews(i13, true);
                    break;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    g71Var.updateAppUpdateViews(i13, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", g71Var.d, null, false);
                        break;
                    }
                }
                break;
            case 17:
                ((org.telegram.ui.Components.voip.v0) obj).b.x(i13, true);
                break;
            case 18:
                ch1 ch1Var = (ch1) obj;
                if (ch1Var.U == null && view.getAlpha() != 0.0f) {
                    ch1Var.c(i13, true);
                    break;
                }
                break;
            case 19:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i13);
                break;
            case 20:
                x70 x70Var = (x70) obj;
                x70Var.Q.dismiss();
                int i16 = x70Var.c0;
                if (i16 >= 0) {
                    x70Var.d0.setKeepMedia(i16, i13);
                    v70 v70Var = x70Var.e0;
                    if (v70Var != null) {
                        v70Var.a(i13);
                        break;
                    }
                } else {
                    v70 v70Var2 = x70Var.e0;
                    if (v70Var2 != null) {
                        v70Var2.a(i13);
                        break;
                    }
                }
                break;
            case 21:
                pg0 pg0Var = (pg0) obj;
                ValueAnimator valueAnimator = pg0Var.c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    pg1 pg1Var = pg0Var.c;
                    if (!pg1Var.H) {
                        if (pg1Var.getCurrentPosition() == i13) {
                            Object X = pg0Var.X();
                            if (X instanceof og0) {
                                ((og0) X).s();
                                break;
                            }
                        } else {
                            pg0Var.m0(i13, true);
                            pg0Var.c.D(i13);
                            break;
                        }
                    }
                }
                break;
            case 22:
                xm0 xm0Var = (xm0) obj;
                xl0 xl0Var = xm0Var.D1;
                xm0Var.S0 = i13;
                if (i13 == 1) {
                    xm0Var.i0 = xm0Var.g0;
                } else if (i13 == 4) {
                    xm0Var.i0 = xm0Var.h0;
                } else if (i13 == 2) {
                    xm0Var.i0 = xm0Var.e0;
                } else if (i13 == 3) {
                    xm0Var.i0 = xm0Var.f0;
                } else {
                    xm0Var.i0 = xm0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, xm0Var, null);
                if (i13 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xm0Var.j1);
                    PhotoViewer.t1().c2(arrayList, 0, xl0Var);
                    break;
                } else if (i13 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(xm0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, xl0Var);
                    break;
                } else if (i13 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(xm0Var.m1);
                    PhotoViewer.t1().c2(arrayList3, 0, xl0Var);
                    break;
                } else if (i13 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = xm0Var.i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), xl0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = xm0Var.k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), xl0Var);
                    break;
                }
            case 23:
                tp0 tp0Var = (tp0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = tp0Var.I;
                if (m1Var != null && m1Var.isShowing()) {
                    tp0Var.I.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(tp0Var.getParentActivity(), tp0Var.F.a(), new kp0(tp0Var, i12));
                    break;
                } else {
                    tp0Var.V(tp0Var.b, tp0Var.c, true, 0);
                    tp0Var.finishFragment();
                    break;
                }
                break;
            case 24:
                kq0 kq0Var = (kq0) obj;
                org.telegram.ui.ActionBar.m1 m1Var2 = kq0Var.m0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    kq0Var.m0.d(true);
                }
                if (i13 == 0) {
                    org.telegram.ui.Components.f5.K(kq0Var.getParentActivity(), kq0Var.U.a(), new xp0(kq0Var, r8));
                    break;
                } else {
                    kq0Var.e0(0, true);
                    break;
                }
                break;
            case 25:
                MessageObject messageObject = (MessageObject) obj;
                int i17 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i13).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                int i18 = 14;
                if (i13 == 0) {
                    pz0 pz0Var = profileActivity.O;
                    if (!pz0Var.C1) {
                        if (sv0.y0(pz0Var.getClosestTab())) {
                            pz0 pz0Var2 = profileActivity.O;
                            profileActivity.O.Q0(profileActivity, profileActivity.a(), pz0Var2.j1(pz0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ei.vb D = ei.vb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.x = new oz0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!sv0.y0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.o8 o8Var = profileActivity.z5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.z5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    boolean z12 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i10 = 0;
                        for (int i19 = 0; i19 < actionModeSelected.size(); i19++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i19).storyItem;
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
                        profileActivity.O.a1(8);
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList6.size()];
                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i20);
                            zArr2[i20] = storyItem2.pinned;
                            storyItem2.pinned = z12;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z13 = z12;
                        profileActivity.z5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList6, z13, 9);
                        z zVar = new z(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 14);
                        (z13 ? org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), zVar).j() : org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, zVar).j()).v = new lv0(i18, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    pz0 pz0Var3 = profileActivity.O;
                    int j12 = pz0Var3.j1(pz0Var3.getClosestTab());
                    String w9 = profileActivity.getMessagesController().getStoriesController().w(j12, a2);
                    org.telegram.messenger.o8 o8Var2 = profileActivity.z5;
                    if (o8Var2 != null) {
                        o8Var2.run();
                        profileActivity.z5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i21 = 0; i21 < actionModeSelected2.size(); i21++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i21).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.O.L(false);
                    if (!arrayList7.isEmpty()) {
                        wb wbVar = new wb(profileActivity, a2, j12, arrayList7, 15);
                        profileActivity.getMessagesController().getStoriesController().c0(j12, a2, arrayList7);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w9)), LocaleController.getString(R.string.UndoNoCaps), wbVar).j();
                        break;
                    }
                }
                break;
            case 27:
                r91 r91Var = (r91) obj;
                r91Var.i0.D(i13);
                r91Var.m0(i13, true);
                break;
            case 28:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) obj;
                EditText editText = iaVar.a;
                TextView[] textViewArr = iaVar.N;
                TextView textView = textViewArr[i13];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i13].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    iaVar.a();
                    iaVar.a();
                    Runnable runnable = iaVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
            default:
                zh.k0 k0Var = ((zh.w) obj).h;
                s4.s sVar = k0Var.d;
                ArrayList arrayList8 = k0Var.n;
                if (i13 >= 0 && i13 < arrayList8.size()) {
                    k0Var.v = true;
                    k0Var.h.a(i13, true);
                    int i22 = ((zh.u) arrayList8.get(i13)).d;
                    int L0 = sVar.L0();
                    if ((sVar.m(i22) != null || Math.abs(i22 - L0) <= k0Var.r * 9) && SharedConfig.animationsEnabled()) {
                        zh.o oVar = new zh.o(k0Var.getContext());
                        oVar.a = ((zh.u) arrayList8.get(i13)).d;
                        sVar.w0(oVar);
                        break;
                    } else {
                        k0Var.c.B0();
                        ll0 ll0Var = k0Var.f;
                        ll0Var.b = L0 < i22 ? 0 : 1;
                        ll0Var.c(i22, 0, false, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ n1(MessageObject messageObject, int i10) {
        this.a = 25;
        this.b = i10;
        this.c = messageObject;
    }
}
