package ci;

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
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bh0;
import org.telegram.ui.ch0;
import org.telegram.ui.d01;
import org.telegram.ui.di1;
import org.telegram.ui.e01;
import org.telegram.ui.fq0;
import org.telegram.ui.jm0;
import org.telegram.ui.jq0;
import org.telegram.ui.kn0;
import org.telegram.ui.m80;
import org.telegram.ui.o80;
import org.telegram.ui.qh1;
import org.telegram.ui.ta1;
import org.telegram.ui.wq0;
import org.telegram.ui.wx0;
import org.telegram.ui.xp0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(Object obj, int i10, int i11) {
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
                AndroidUtilities.forEachViews((RecyclerView) bbVar.b, (Utilities.Callback<View>) new ai.y1(bbVar, 10));
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
                ((yn) obj).F9(i14);
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
                g0Var.s();
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
                chatAttachAlertPhotoLayout.b.X0.getActionBarMenuOnItemClick().b(i14);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 9:
                ((p30) obj).b.x(i14, true);
                break;
            case 10:
                p30 p30Var = ((o30) obj).c;
                p30Var.n(i14);
                p30Var.dismiss();
                break;
            case 11:
                qd0 qd0Var = (qd0) obj;
                if (qd0Var.e.getAdapter() instanceof od0) {
                    nz nzVar = ((hy) ((od0) qd0Var.e.getAdapter())).c;
                    if ((i14 != 1 && i14 != 2) || !nzVar.w1) {
                        if (i14 == 0 && nzVar.v1) {
                            nzVar.N(true, true, false);
                            break;
                        }
                    } else {
                        nzVar.N(true, false, i14 == 1);
                        break;
                    }
                }
                qd0Var.e.x(i14, false);
                break;
            case 12:
                org.telegram.ui.Components.q4 q4Var = (org.telegram.ui.Components.q4) obj;
                EditTextBoldCursor editTextBoldCursor = q4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                q4Var.d.run(Integer.valueOf(i14), editTextBoldCursor.getText().toString());
                q4Var.dismiss();
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i14, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 14:
                l71 l71Var = (l71) obj;
                int i15 = l71Var.b.i.q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    l71Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    l71Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", l71Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i14, true);
                break;
            case 16:
                di1 di1Var = (di1) obj;
                if (di1Var.U == null && view.getAlpha() != 0.0f) {
                    di1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                o80 o80Var = (o80) obj;
                o80Var.Q.dismiss();
                int i16 = o80Var.c0;
                if (i16 >= 0) {
                    o80Var.d0.setKeepMedia(i16, i14);
                    m80 m80Var = o80Var.e0;
                    if (m80Var != null) {
                        m80Var.a(i14);
                        break;
                    }
                } else {
                    m80 m80Var2 = o80Var.e0;
                    if (m80Var2 != null) {
                        m80Var2.a(i14);
                        break;
                    }
                }
                break;
            case 19:
                ch0 ch0Var = (ch0) obj;
                ValueAnimator valueAnimator = ch0Var.c.S;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    qh1 qh1Var = ch0Var.c;
                    if (!qh1Var.H) {
                        if (qh1Var.getCurrentPosition() == i14) {
                            Object W = ch0Var.W();
                            if (W instanceof bh0) {
                                ((bh0) W).r();
                                break;
                            }
                        } else {
                            ch0Var.m0(i14, true);
                            ch0Var.c.E(i14);
                            break;
                        }
                    }
                }
                break;
            case 20:
                kn0 kn0Var = (kn0) obj;
                jm0 jm0Var = kn0Var.D1;
                kn0Var.S0 = i14;
                if (i14 == 1) {
                    kn0Var.i0 = kn0Var.g0;
                } else if (i14 == 4) {
                    kn0Var.i0 = kn0Var.h0;
                } else if (i14 == 2) {
                    kn0Var.i0 = kn0Var.e0;
                } else if (i14 == 3) {
                    kn0Var.i0 = kn0Var.f0;
                } else {
                    kn0Var.i0 = kn0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, kn0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(kn0Var.j1);
                    PhotoViewer.t1().c2(arrayList, 0, jm0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(kn0Var.l1);
                    PhotoViewer.t1().c2(arrayList2, 0, jm0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(kn0Var.m1);
                    PhotoViewer.t1().c2(arrayList3, 0, jm0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = kn0Var.i1;
                    t12.c2(arrayList4, arrayList4.indexOf(secureDocument), jm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = kn0Var.k1;
                    t13.c2(arrayList5, arrayList5.indexOf(secureDocument), jm0Var);
                    break;
                }
            case 21:
                fq0 fq0Var = (fq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = fq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    fq0Var.I.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.e5.L(fq0Var.getParentActivity(), fq0Var.F.a(), new xp0(fq0Var, i12));
                    break;
                } else {
                    fq0Var.T(fq0Var.b, fq0Var.c, true, 0);
                    fq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                wq0 wq0Var = (wq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = wq0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    wq0Var.m0.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.e5.L(wq0Var.getParentActivity(), wq0Var.U.a(), new jq0(wq0Var, i13));
                    break;
                } else {
                    wq0Var.e0(0, true);
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
                    e01 e01Var = profileActivity.O;
                    if (!e01Var.C1) {
                        if (qv0.w0(e01Var.getClosestTab())) {
                            e01 e01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), e01Var2.h1(e01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            kc E = kc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new d01(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!qv0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.o8 o8Var = profileActivity.x5;
                    if (o8Var != null) {
                        o8Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.rc.e();
                    int i18 = 9;
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
                        profileActivity.O.Y0(8);
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
                        profileActivity.x5 = new org.telegram.messenger.o8(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.yc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j() : org.telegram.ui.Components.yc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j()).v = new wx0(i18, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    e01 e01Var3 = profileActivity.O;
                    int h12 = e01Var3.h1(e01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.o8 o8Var2 = profileActivity.x5;
                    if (o8Var2 != null) {
                        o8Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.rc.e();
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
                        org.telegram.messenger.g7 g7Var = new org.telegram.messenger.g7(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.yc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), g7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                ta1 ta1Var = (ta1) obj;
                ta1Var.h0.E(i14);
                ta1Var.k0(i14, true);
                break;
            case 26:
                yh.s0 s0Var = ((yh.t0) obj).j0;
                int i22 = yh.s0.s;
                s0Var.a(i14);
                break;
            default:
                ((yh.s0) obj).a(i14);
                break;
        }
    }

    public /* synthetic */ n4(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
