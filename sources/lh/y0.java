package lh;

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
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l30;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cm0;
import org.telegram.ui.dn0;
import org.telegram.ui.e80;
import org.telegram.ui.fq0;
import org.telegram.ui.g80;
import org.telegram.ui.ga1;
import org.telegram.ui.gh1;
import org.telegram.ui.hp0;
import org.telegram.ui.pp0;
import org.telegram.ui.rz0;
import org.telegram.ui.sz0;
import org.telegram.ui.th1;
import org.telegram.ui.tp0;
import org.telegram.ui.ug0;
import org.telegram.ui.vg0;
import org.telegram.ui.xn;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i10;
        Utilities.Callback callback;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 2;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                i1 i1Var = ((j1) obj).g0;
                int i16 = i1.s;
                i1Var.a(i15);
                break;
            case 1:
                ((i1) obj).a(i15);
                break;
            case 2:
                ((xn) obj).G9(i15);
                break;
            case 3:
                org.telegram.ui.Components.h0 h0Var = (org.telegram.ui.Components.h0) obj;
                if (i15 == 0) {
                    h0Var.a0 = !h0Var.a0;
                } else if (i15 == 1) {
                    h0Var.b0 = !h0Var.b0;
                } else if (i15 == 2) {
                    h0Var.c0 = !h0Var.c0;
                }
                h0Var.U.N(true);
                h0Var.s();
                break;
            case 4:
                boolean[] zArr = (boolean[]) obj;
                boolean z4 = !zArr[i15];
                zArr[i15] = z4;
                ((org.telegram.ui.Cells.z1) view).c(z4, true);
                break;
            case 5:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                chatAttachAlertPhotoLayout.b.U0.getActionBarMenuOnItemClick().b(i15);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 6:
                ((m30) obj).b.x(i15, true);
                break;
            case 7:
                m30 m30Var = ((l30) obj).c;
                m30Var.n(i15);
                m30Var.dismiss();
                break;
            case 8:
                fd0 fd0Var = (fd0) obj;
                if (fd0Var.e.getAdapter() instanceof dd0) {
                    kz kzVar = ((cy) ((dd0) fd0Var.e.getAdapter())).c;
                    if ((i15 != 1 && i15 != 2) || !kzVar.t1) {
                        if (i15 == 0 && kzVar.s1) {
                            kzVar.R(true, true, false);
                            break;
                        }
                    } else {
                        kzVar.R(true, false, i15 == 1);
                        break;
                    }
                }
                fd0Var.e.x(i15, false);
                break;
            case 9:
                org.telegram.ui.Components.l4 l4Var = (org.telegram.ui.Components.l4) obj;
                EditTextBoldCursor editTextBoldCursor = l4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                l4Var.d.run(Integer.valueOf(i15), editTextBoldCursor.getText().toString());
                l4Var.dismiss();
                break;
            case 10:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i15, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 11:
                n61 n61Var = (n61) obj;
                int i17 = n61Var.b.i.q;
                if (i17 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    n61Var.updateAppUpdateViews(i15, true);
                    break;
                } else if (i17 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    n61Var.updateAppUpdateViews(i15, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", n61Var.d, null, false);
                        break;
                    }
                }
                break;
            case 12:
                ((org.telegram.ui.Components.voip.u0) obj).b.x(i15, true);
                break;
            case 13:
                th1 th1Var = (th1) obj;
                if (th1Var.R == null && view.getAlpha() != 0.0f) {
                    th1Var.c(i15, true);
                    break;
                }
                break;
            case 14:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 15:
                g80 g80Var = (g80) obj;
                g80Var.N.dismiss();
                int i18 = g80Var.W;
                if (i18 >= 0) {
                    g80Var.a0.setKeepMedia(i18, i15);
                    e80 e80Var = g80Var.b0;
                    if (e80Var != null) {
                        e80Var.a(i15);
                        break;
                    }
                } else {
                    e80 e80Var2 = g80Var.b0;
                    if (e80Var2 != null) {
                        e80Var2.a(i15);
                        break;
                    }
                }
                break;
            case 16:
                vg0 vg0Var = (vg0) obj;
                ValueAnimator valueAnimator = vg0Var.c.N;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    gh1 gh1Var = vg0Var.c;
                    if (!gh1Var.E) {
                        if (gh1Var.getCurrentPosition() == i15) {
                            Object X = vg0Var.X();
                            if (X instanceof ug0) {
                                ((ug0) X).s();
                                break;
                            }
                        } else {
                            vg0Var.m0(i15, true);
                            vg0Var.c.D(i15);
                            break;
                        }
                    }
                }
                break;
            case 17:
                dn0 dn0Var = (dn0) obj;
                cm0 cm0Var = dn0Var.A1;
                dn0Var.P0 = i15;
                if (i15 == 1) {
                    dn0Var.f0 = dn0Var.d0;
                } else if (i15 == 4) {
                    dn0Var.f0 = dn0Var.e0;
                } else if (i15 == 2) {
                    dn0Var.f0 = dn0Var.b0;
                } else if (i15 == 3) {
                    dn0Var.f0 = dn0Var.c0;
                } else {
                    dn0Var.f0 = dn0Var.a0;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, dn0Var, null);
                if (i15 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(dn0Var.g1);
                    PhotoViewer.t1().b2(arrayList, 0, cm0Var);
                    break;
                } else if (i15 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dn0Var.i1);
                    PhotoViewer.t1().b2(arrayList2, 0, cm0Var);
                    break;
                } else if (i15 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(dn0Var.j1);
                    PhotoViewer.t1().b2(arrayList3, 0, cm0Var);
                    break;
                } else if (i15 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = dn0Var.f1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), cm0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = dn0Var.h1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), cm0Var);
                    break;
                }
            case 18:
                pp0 pp0Var = (pp0) obj;
                org.telegram.ui.ActionBar.p1 p1Var = pp0Var.F;
                if (p1Var != null && p1Var.isShowing()) {
                    pp0Var.F.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.z4.L(pp0Var.getParentActivity(), pp0Var.C.a(), new hp0(pp0Var, i13));
                    break;
                } else {
                    pp0Var.V(pp0Var.b, pp0Var.c, true, 0);
                    pp0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                fq0 fq0Var = (fq0) obj;
                org.telegram.ui.ActionBar.p1 p1Var2 = fq0Var.j0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    fq0Var.j0.d(true);
                }
                if (i15 == 0) {
                    org.telegram.ui.Components.z4.L(fq0Var.getParentActivity(), fq0Var.R.a(), new tp0(fq0Var, i14));
                    break;
                } else {
                    fq0Var.e0(0, true);
                    break;
                }
                break;
            case 20:
                MessageObject messageObject = (MessageObject) obj;
                int i19 = PopupNotificationActivity.Y;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i15).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i15 == 0) {
                    sz0 sz0Var = profileActivity.L;
                    if (!sz0Var.z1) {
                        if (yu0.w0(sz0Var.getClosestTab())) {
                            sz0 sz0Var2 = profileActivity.L;
                            profileActivity.L.O0(profileActivity, profileActivity.a(), sz0Var2.h1(sz0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            ph.da E = ph.da.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new rz0(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!yu0.w0(profileActivity.L.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.w8 w8Var = profileActivity.u5;
                    if (w8Var != null) {
                        w8Var.run();
                        profileActivity.u5 = null;
                    }
                    ic.e();
                    boolean z11 = profileActivity.L.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.L.getActionModeSelected();
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
                    profileActivity.L.L(false);
                    if (z11) {
                        profileActivity.L.Y0(8);
                    }
                    if (!arrayList6.isEmpty()) {
                        boolean[] zArr2 = new boolean[arrayList6.size()];
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList6.get(i21);
                            zArr2[i21] = storyItem2.pinned;
                            storyItem2.pinned = z11;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList6, false);
                        boolean[] zArr3 = {false};
                        boolean z12 = z11;
                        profileActivity.u5 = new org.telegram.messenger.w8(profileActivity, clientUserId, arrayList6, z12, 9);
                        kh.g1 g1Var = new kh.g1(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 15);
                        (z12 ? qc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), g1Var).j() : qc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, g1Var).j()).v = new zq0(24, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    sz0 sz0Var3 = profileActivity.L;
                    int h12 = sz0Var3.h1(sz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.w8 w8Var2 = profileActivity.u5;
                    if (w8Var2 != null) {
                        w8Var2.run();
                        profileActivity.u5 = null;
                    }
                    ic.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.L.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i22 = 0; i22 < actionModeSelected2.size(); i22++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i22).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.L.L(false);
                    if (!arrayList7.isEmpty()) {
                        y8 y8Var = new y8(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        qc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), y8Var).j();
                        break;
                    }
                }
                break;
            case 22:
                ga1 ga1Var = (ga1) obj;
                ga1Var.f0.D(i15);
                ga1Var.m0(i15, true);
                break;
            case 23:
                ph.w8 w8Var3 = (ph.w8) obj;
                if (!w8Var3.e.contains(Integer.valueOf(i15))) {
                    w8Var3.e.add(Integer.valueOf(i15));
                } else if (w8Var3.e.size() > 1) {
                    w8Var3.e.remove(Integer.valueOf(i15));
                }
                AndroidUtilities.forEachViews((RecyclerView) w8Var3.b, (h5.d) new mg.i(w8Var3, i12));
                break;
            case 24:
                ph.f5 f5Var = ((ph.d5) obj).b;
                if (f5Var.r && (callback = f5Var.f) != null) {
                    callback.run(Integer.valueOf(i15));
                    break;
                }
                break;
            case 25:
                ((vh.y1) obj).M.Y3(i15);
                break;
            case 26:
                View.OnClickListener onClickListener = ((wg.e) obj).b[i15];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                wg.a aVar = ((wg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i15);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y0(MessageObject messageObject, int i10) {
        this.a = 20;
        this.b = i10;
        this.c = messageObject;
    }
}
