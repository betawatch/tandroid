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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab1;
import org.telegram.ui.bo;
import org.telegram.ui.cr0;
import org.telegram.ui.dq0;
import org.telegram.ui.fh0;
import org.telegram.ui.gh0;
import org.telegram.ui.ky0;
import org.telegram.ui.lq0;
import org.telegram.ui.m01;
import org.telegram.ui.mi1;
import org.telegram.ui.n01;
import org.telegram.ui.p80;
import org.telegram.ui.pm0;
import org.telegram.ui.pq0;
import org.telegram.ui.qn0;
import org.telegram.ui.r80;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i10;
        int i11 = this.a;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                fb fbVar = (fb) obj;
                if (!fbVar.e.contains(Integer.valueOf(i15))) {
                    fbVar.e.add(Integer.valueOf(i15));
                } else if (fbVar.e.size() > 1) {
                    fbVar.e.remove(Integer.valueOf(i15));
                }
                AndroidUtilities.forEachViews((RecyclerView) fbVar.b, (e2.h) new ai.f3(fbVar, i12));
                break;
            case 1:
                v6 v6Var = ((t6) obj).b;
                if (v6Var.r && (callback = v6Var.f) != null) {
                    callback.run(Integer.valueOf(i15));
                    break;
                }
                break;
            case 2:
                ((ii.d2) obj).P.Z3(i15);
                break;
            case 3:
                View.OnClickListener onClickListener = ((jh.e) obj).b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 4:
                jh.a aVar = ((jh.h) obj).h;
                if (aVar != null) {
                    aVar.k(i15);
                    break;
                }
                break;
            case 5:
                ((bo) obj).G9(i15);
                break;
            case 6:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i15 == 0) {
                    g0Var.d0 = !g0Var.d0;
                } else if (i15 == 1) {
                    g0Var.e0 = !g0Var.e0;
                } else if (i15 == 2) {
                    g0Var.f0 = !g0Var.f0;
                }
                g0Var.X.N(true);
                g0Var.s();
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
                ((l30) obj).b.x(i15, true);
                break;
            case 10:
                l30 l30Var = ((k30) obj).c;
                l30Var.n(i15);
                l30Var.dismiss();
                break;
            case 11:
                dd0 dd0Var = (dd0) obj;
                if (dd0Var.e.getAdapter() instanceof bd0) {
                    kz kzVar = ((dy) ((bd0) dd0Var.e.getAdapter())).c;
                    if ((i15 != 1 && i15 != 2) || !kzVar.w1) {
                        if (i15 == 0 && kzVar.v1) {
                            kzVar.P(true, true, false);
                            break;
                        }
                    } else {
                        kzVar.P(true, false, i15 == 1);
                        break;
                    }
                }
                dd0Var.e.x(i15, false);
                break;
            case 12:
                org.telegram.ui.Components.o4 o4Var = (org.telegram.ui.Components.o4) obj;
                EditTextBoldCursor editTextBoldCursor = o4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                o4Var.d.run(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                o4Var.dismiss();
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i15, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 14:
                m61 m61Var = (m61) obj;
                int i16 = m61Var.b.i.q;
                if (i16 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    m61Var.updateAppUpdateViews(i15, true);
                    break;
                } else if (i16 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    m61Var.updateAppUpdateViews(i15, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", m61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.Components.voip.x0) obj).b.x(i15, true);
                break;
            case 16:
                mi1 mi1Var = (mi1) obj;
                if (mi1Var.U == null && view.getAlpha() != 0.0f) {
                    mi1Var.c(i15, true);
                    break;
                }
                break;
            case 17:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 18:
                r80 r80Var = (r80) obj;
                r80Var.Q.dismiss();
                int i17 = r80Var.c0;
                if (i17 >= 0) {
                    r80Var.d0.setKeepMedia(i17, i15);
                    p80 p80Var = r80Var.e0;
                    if (p80Var != null) {
                        p80Var.a(i15);
                        break;
                    }
                } else {
                    p80 p80Var2 = r80Var.e0;
                    if (p80Var2 != null) {
                        p80Var2.a(i15);
                        break;
                    }
                }
                break;
            case 19:
                gh0 gh0Var = (gh0) obj;
                ValueAnimator valueAnimator = gh0Var.c.R;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    zh1 zh1Var = gh0Var.c;
                    if (!zh1Var.H) {
                        if (zh1Var.getCurrentPosition() == i15) {
                            Object X = gh0Var.X();
                            if (X instanceof fh0) {
                                ((fh0) X).r();
                                break;
                            }
                        } else {
                            gh0Var.m0(i15, true);
                            gh0Var.c.E(i15);
                            break;
                        }
                    }
                }
                break;
            case 20:
                qn0 qn0Var = (qn0) obj;
                pm0 pm0Var = qn0Var.D1;
                qn0Var.S0 = i15;
                if (i15 == 1) {
                    qn0Var.i0 = qn0Var.g0;
                } else if (i15 == 4) {
                    qn0Var.i0 = qn0Var.h0;
                } else if (i15 == 2) {
                    qn0Var.i0 = qn0Var.e0;
                } else if (i15 == 3) {
                    qn0Var.i0 = qn0Var.f0;
                } else {
                    qn0Var.i0 = qn0Var.d0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().J2(null, qn0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(qn0Var.j1);
                    PhotoViewer.t1().b2(arrayList, 0, pm0Var);
                    break;
                } else if (i15 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(qn0Var.l1);
                    PhotoViewer.t1().b2(arrayList2, 0, pm0Var);
                    break;
                } else if (i15 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(qn0Var.m1);
                    PhotoViewer.t1().b2(arrayList3, 0, pm0Var);
                    break;
                } else if (i15 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = qn0Var.i1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), pm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = qn0Var.k1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), pm0Var);
                    break;
                }
            case 21:
                lq0 lq0Var = (lq0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = lq0Var.I;
                if (o1Var != null && o1Var.isShowing()) {
                    lq0Var.I.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.c5.L(lq0Var.getParentActivity(), lq0Var.F.a(), new dq0(lq0Var, i13));
                    break;
                } else {
                    lq0Var.V(lq0Var.b, lq0Var.c, true, 0);
                    lq0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                cr0 cr0Var = (cr0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = cr0Var.m0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    cr0Var.m0.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.c5.L(cr0Var.getParentActivity(), cr0Var.U.a(), new pq0(cr0Var, i14));
                    break;
                } else {
                    cr0Var.e0(0, true);
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
                    n01 n01Var = profileActivity.O;
                    if (!n01Var.C1) {
                        if (zu0.w0(n01Var.getClosestTab())) {
                            n01 n01Var2 = profileActivity.O;
                            profileActivity.O.O0(profileActivity, profileActivity.a(), n01Var2.h1(n01Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            oc E = oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new m01(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!zu0.w0(profileActivity.O.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.t8 t8Var = profileActivity.x5;
                    if (t8Var != null) {
                        t8Var.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.oc.e();
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
                        profileActivity.x5 = new org.telegram.messenger.t8(profileActivity, clientUserId, arrayList6, z12, 9);
                        org.telegram.messenger.voip.f fVar = new org.telegram.messenger.voip.f(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 7);
                        (z13 ? org.telegram.ui.Components.vc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), fVar).j() : org.telegram.ui.Components.vc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, fVar).j()).v = new ky0(6, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    n01 n01Var3 = profileActivity.O;
                    int h12 = n01Var3.h1(n01Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.t8 t8Var2 = profileActivity.x5;
                    if (t8Var2 != null) {
                        t8Var2.run();
                        profileActivity.x5 = null;
                    }
                    org.telegram.ui.Components.oc.e();
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
                        org.telegram.messenger.j7 j7Var = new org.telegram.messenger.j7(profileActivity, a2, h12, arrayList7, 13);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        org.telegram.ui.Components.vc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), j7Var).j();
                        break;
                    }
                }
                break;
            case 25:
                ab1 ab1Var = (ab1) obj;
                ab1Var.i0.E(i15);
                ab1Var.m0(i15, true);
                break;
            case 26:
                yh.r0 r0Var = ((yh.s0) obj).j0;
                int i22 = yh.r0.s;
                r0Var.a(i15);
                break;
            default:
                ((yh.r0) obj).a(i15);
                break;
        }
    }

    public /* synthetic */ o4(MessageObject messageObject, int i10) {
        this.a = 23;
        this.b = i10;
        this.c = messageObject;
    }
}
