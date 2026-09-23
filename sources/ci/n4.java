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
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.by0;
import org.telegram.ui.d01;
import org.telegram.ui.dq0;
import org.telegram.ui.e01;
import org.telegram.ui.fi1;
import org.telegram.ui.hm0;
import org.telegram.ui.hq0;
import org.telegram.ui.in0;
import org.telegram.ui.k80;
import org.telegram.ui.m80;
import org.telegram.ui.ra1;
import org.telegram.ui.sh1;
import org.telegram.ui.uq0;
import org.telegram.ui.vp0;
import org.telegram.ui.xn;
import org.telegram.ui.yg0;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ((ii.e2) obj).P.Y3(i14);
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
                    aVar.k(i14);
                    break;
                }
                break;
            case 5:
                ((xn) obj).G9(i14);
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
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                break;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.b.X0.getActionBarMenuOnItemClick().b(i14);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 9:
                ((m30) obj).b.x(i14, true);
                break;
            case 10:
                m30 m30Var = ((l30) obj).c;
                m30Var.n(i14);
                m30Var.dismiss();
                break;
            case 11:
                dd0 dd0Var = (dd0) obj;
                if (dd0Var.e.getAdapter() instanceof bd0) {
                    lz lzVar = ((ey) ((bd0) dd0Var.e.getAdapter())).c;
                    if ((i14 != 1 && i14 != 2) || !lzVar.w1) {
                        if (i14 == 0 && lzVar.v1) {
                            lzVar.P(true, true, false);
                            break;
                        }
                    } else {
                        lzVar.P(true, false, i14 == 1);
                        break;
                    }
                }
                dd0Var.e.x(i14, false);
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
                k61 k61Var = (k61) obj;
                int i15 = k61Var.b.i.q;
                if (i15 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    k61Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i15 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    k61Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", k61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i14, true);
                break;
            case 16:
                fi1 fi1Var = (fi1) obj;
                if (fi1Var.U == null && view.getAlpha() != 0.0f) {
                    fi1Var.c(i14, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 18:
                m80 m80Var = (m80) obj;
                m80Var.Q.dismiss();
                int i16 = m80Var.c0;
                if (i16 >= 0) {
                    m80Var.d0.setKeepMedia(i16, i14);
                    k80 k80Var = m80Var.e0;
                    if (k80Var != null) {
                        k80Var.a(i14);
                        break;
                    }
                } else {
                    k80 k80Var2 = m80Var.e0;
                    if (k80Var2 != null) {
                        k80Var2.a(i14);
                        break;
                    }
                }
                break;
            case 19:
                zg0 zg0Var = (zg0) obj;
                ValueAnimator valueAnimator = zg0Var.c.Q;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sh1 sh1Var = zg0Var.c;
                    if (!sh1Var.H) {
                        if (sh1Var.getCurrentPosition() == i14) {
                            Object X = zg0Var.X();
                            if (X instanceof yg0) {
                                ((yg0) X).r();
                                break;
                            }
                        } else {
                            zg0Var.m0(i14, true);
                            zg0Var.c.D(i14);
                            break;
                        }
                    }
                }
                break;
            case 20:
                in0 in0Var = (in0) obj;
                hm0 hm0Var = in0Var.D1;
                in0Var.S0 = i14;
                if (i14 == 1) {
                    in0Var.i0 = in0Var.g0;
                } else if (i14 == 4) {
                    in0Var.i0 = in0Var.h0;
                } else if (i14 == 2) {
                    in0Var.i0 = in0Var.e0;
                } else if (i14 == 3) {
                    in0Var.i0 = in0Var.f0;
                } else {
                    in0Var.i0 = in0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, in0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(in0Var.j1);
                    PhotoViewer.t1().b2(arrayList, 0, hm0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(in0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, hm0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(in0Var.m1);
                    PhotoViewer.t1().b2(arrayList3, 0, hm0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = in0Var.i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), hm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = in0Var.k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), hm0Var);
                    break;
                }
            case 21:
                dq0 dq0Var = (dq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var = dq0Var.I;
                if (n1Var != null && n1Var.isShowing()) {
                    dq0Var.I.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.e5.L(dq0Var.getParentActivity(), dq0Var.F.a(), new vp0(dq0Var, i12));
                    break;
                } else {
                    dq0Var.V(dq0Var.b, dq0Var.c, true, 0);
                    dq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                uq0 uq0Var = (uq0) obj;
                org.telegram.ui.ActionBar.n1 n1Var2 = uq0Var.m0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    uq0Var.m0.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.e5.L(uq0Var.getParentActivity(), uq0Var.U.a(), new hq0(uq0Var, i13));
                    break;
                } else {
                    uq0Var.e0(0, true);
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
                        if (yu0.w0(e01Var.getClosestTab())) {
                            e01 e01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), e01Var2.h1(e01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            lc E = lc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new d01(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!yu0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.u8 u8Var = profileActivity.x5;
                    if (u8Var != null) {
                        u8Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
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
                        profileActivity.x5 = new org.telegram.messenger.u8(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.xc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j() : org.telegram.ui.Components.xc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j()).v = new by0(6, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    e01 e01Var3 = profileActivity.O;
                    int h12 = e01Var3.h1(e01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.u8 u8Var2 = profileActivity.x5;
                    if (u8Var2 != null) {
                        u8Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
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
                        org.telegram.messenger.j7 j7Var = new org.telegram.messenger.j7(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.xc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                ra1 ra1Var = (ra1) obj;
                ra1Var.i0.D(i14);
                ra1Var.m0(i14, true);
                break;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).j0;
                int i21 = yh.r0.s;
                r0Var.a(i14);
                break;
            default:
                ((yh.r0) obj).a(i14);
                break;
        }
    }

    public /* synthetic */ n4(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
