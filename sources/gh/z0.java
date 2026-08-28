package gh;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import kh.wb;
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
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.wy;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ap0;
import org.telegram.ui.fh1;
import org.telegram.ui.gz0;
import org.telegram.ui.hz0;
import org.telegram.ui.ip0;
import org.telegram.ui.mg0;
import org.telegram.ui.mp0;
import org.telegram.ui.ng0;
import org.telegram.ui.qn;
import org.telegram.ui.s70;
import org.telegram.ui.s91;
import org.telegram.ui.sg1;
import org.telegram.ui.u70;
import org.telegram.ui.wl0;
import org.telegram.ui.wm0;
import org.telegram.ui.ys0;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z0(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Utilities.Callback callback;
        int i9;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 2;
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                k1 k1Var = ((l1) obj).f0;
                int i15 = k1.s;
                k1Var.a(i14);
                break;
            case 1:
                ((k1) obj).a(i14);
                break;
            case 2:
                kh.na naVar = (kh.na) obj;
                if (!naVar.e.contains(Integer.valueOf(i14))) {
                    naVar.e.add(Integer.valueOf(i14));
                } else if (naVar.e.size() > 1) {
                    naVar.e.remove(Integer.valueOf(i14));
                }
                AndroidUtilities.forEachViews((RecyclerView) naVar.b, (d5.d) new hg.i(naVar, i11));
                break;
            case 3:
                kh.k6 k6Var = ((kh.i6) obj).b;
                if (k6Var.r && (callback = k6Var.f) != null) {
                    callback.run(Integer.valueOf(i14));
                    break;
                }
                break;
            case 4:
                ((qn) obj).G9(i14);
                break;
            case 5:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj;
                if (i14 == 0) {
                    g0Var.Z = !g0Var.Z;
                } else if (i14 == 1) {
                    g0Var.a0 = !g0Var.a0;
                } else if (i14 == 2) {
                    g0Var.b0 = !g0Var.b0;
                }
                g0Var.T.N(true);
                g0Var.s();
                break;
            case 6:
                boolean[] zArr = (boolean[]) obj;
                boolean z10 = !zArr[i14];
                zArr[i14] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                break;
            case 7:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                chatAttachAlertPhotoLayout.b.T0.getActionBarMenuOnItemClick().b(i14);
                chatAttachAlertPhotoLayout.w.M(null, null);
                break;
            case 8:
                ((v20) obj).b.x(i14, true);
                break;
            case 9:
                v20 v20Var = ((u20) obj).c;
                v20Var.n(i14);
                v20Var.dismiss();
                break;
            case 10:
                kc0 kc0Var = (kc0) obj;
                if (kc0Var.e.getAdapter() instanceof ic0) {
                    wy wyVar = ((px) ((ic0) kc0Var.e.getAdapter())).c;
                    if ((i14 != 1 && i14 != 2) || !wyVar.s1) {
                        if (i14 == 0 && wyVar.r1) {
                            wyVar.Q(true, true, false);
                            break;
                        }
                    } else {
                        wyVar.Q(true, false, i14 == 1);
                        break;
                    }
                }
                kc0Var.e.x(i14, false);
                break;
            case 11:
                org.telegram.ui.Components.k4 k4Var = (org.telegram.ui.Components.k4) obj;
                EditTextBoldCursor editTextBoldCursor = k4Var.c;
                AndroidUtilities.hideKeyboard(editTextBoldCursor);
                k4Var.d.run(Integer.valueOf(i14), editTextBoldCursor.getText().toString());
                k4Var.dismiss();
                break;
            case 12:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) obj;
                scrollSlidingTextTabStrip.h(view, i14, scrollSlidingTextTabStrip.a.indexOfChild(view));
                break;
            case 13:
                p51 p51Var = (p51) obj;
                int i16 = p51Var.b.i.q;
                if (i16 == 2) {
                    ApplicationLoader.applicationLoaderInstance.downloadUpdate();
                    p51Var.updateAppUpdateViews(i14, true);
                    break;
                } else if (i16 == 3) {
                    ApplicationLoader.applicationLoaderInstance.cancelDownloadingUpdate();
                    p51Var.updateAppUpdateViews(i14, true);
                    break;
                } else {
                    File downloadedUpdateFile = ApplicationLoader.applicationLoaderInstance.getDownloadedUpdateFile();
                    if (downloadedUpdateFile != null) {
                        AndroidUtilities.openForView(downloadedUpdateFile, "Telegram.apk", "application/vnd.android.package-archive", p51Var.d, null, false);
                        break;
                    }
                }
                break;
            case 14:
                ((org.telegram.ui.Components.voip.u0) obj).b.x(i14, true);
                break;
            case 15:
                fh1 fh1Var = (fh1) obj;
                if (fh1Var.Q == null && view.getAlpha() != 0.0f) {
                    fh1Var.c(i14, true);
                    break;
                }
                break;
            case 16:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 17:
                u70 u70Var = (u70) obj;
                u70Var.M.dismiss();
                int i17 = u70Var.V;
                if (i17 >= 0) {
                    u70Var.W.setKeepMedia(i17, i14);
                    s70 s70Var = u70Var.a0;
                    if (s70Var != null) {
                        s70Var.a(i14);
                        break;
                    }
                } else {
                    s70 s70Var2 = u70Var.a0;
                    if (s70Var2 != null) {
                        s70Var2.a(i14);
                        break;
                    }
                }
                break;
            case 18:
                ng0 ng0Var = (ng0) obj;
                ValueAnimator valueAnimator = ng0Var.c.M;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    sg1 sg1Var = ng0Var.c;
                    if (!sg1Var.D) {
                        if (sg1Var.getCurrentPosition() == i14) {
                            Object W = ng0Var.W();
                            if (W instanceof mg0) {
                                ((mg0) W).s();
                                break;
                            }
                        } else {
                            ng0Var.l0(i14, true);
                            ng0Var.c.D(i14);
                            break;
                        }
                    }
                }
                break;
            case 19:
                wm0 wm0Var = (wm0) obj;
                wl0 wl0Var = wm0Var.z1;
                wm0Var.O0 = i14;
                if (i14 == 1) {
                    wm0Var.e0 = wm0Var.c0;
                } else if (i14 == 4) {
                    wm0Var.e0 = wm0Var.d0;
                } else if (i14 == 2) {
                    wm0Var.e0 = wm0Var.a0;
                } else if (i14 == 3) {
                    wm0Var.e0 = wm0Var.b0;
                } else {
                    wm0Var.e0 = wm0Var.Z;
                }
                SecureDocument secureDocument = (SecureDocument) view.getTag();
                PhotoViewer.t1().K2(null, wm0Var, null);
                if (i14 == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(wm0Var.f1);
                    PhotoViewer.t1().b2(arrayList, 0, wl0Var);
                    break;
                } else if (i14 == 2) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(wm0Var.h1);
                    PhotoViewer.t1().b2(arrayList2, 0, wl0Var);
                    break;
                } else if (i14 == 3) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(wm0Var.i1);
                    PhotoViewer.t1().b2(arrayList3, 0, wl0Var);
                    break;
                } else if (i14 == 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    ArrayList arrayList4 = wm0Var.e1;
                    t12.b2(arrayList4, arrayList4.indexOf(secureDocument), wl0Var);
                    break;
                } else {
                    PhotoViewer t13 = PhotoViewer.t1();
                    ArrayList arrayList5 = wm0Var.g1;
                    t13.b2(arrayList5, arrayList5.indexOf(secureDocument), wl0Var);
                    break;
                }
            case 20:
                ip0 ip0Var = (ip0) obj;
                org.telegram.ui.ActionBar.o1 o1Var = ip0Var.E;
                if (o1Var != null && o1Var.isShowing()) {
                    ip0Var.E.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.y4.L(ip0Var.getParentActivity(), ip0Var.B.a(), new ap0(ip0Var, i12));
                    break;
                } else {
                    ip0Var.U(ip0Var.b, ip0Var.c, true, 0);
                    ip0Var.finishFragment();
                    break;
                }
                break;
            case 21:
                zp0 zp0Var = (zp0) obj;
                org.telegram.ui.ActionBar.o1 o1Var2 = zp0Var.i0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    zp0Var.i0.d(true);
                }
                if (i14 == 0) {
                    org.telegram.ui.Components.y4.L(zp0Var.getParentActivity(), zp0Var.Q.a(), new mp0(zp0Var, i13));
                    break;
                } else {
                    zp0Var.d0(0, true);
                    break;
                }
                break;
            case 22:
                MessageObject messageObject = (MessageObject) obj;
                int i18 = PopupNotificationActivity.X;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i14).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i14 == 0) {
                    hz0 hz0Var = profileActivity.K;
                    if (!hz0Var.y1) {
                        if (eu0.w0(hz0Var.getClosestTab())) {
                            hz0 hz0Var2 = profileActivity.K;
                            profileActivity.K.O0(profileActivity, profileActivity.a(), hz0Var2.h1(hz0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            wb E = wb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            E.x = new gz0(profileActivity);
                            E.R(null);
                            break;
                        } else {
                            profileActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!eu0.w0(profileActivity.K.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.q8 q8Var = profileActivity.t5;
                    if (q8Var != null) {
                        q8Var.run();
                        profileActivity.t5 = null;
                    }
                    gc.e();
                    boolean z12 = profileActivity.K.getClosestTab() == 9;
                    ArrayList arrayList6 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected != null) {
                        i9 = 0;
                        for (int i19 = 0; i19 < actionModeSelected.size(); i19++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i19).storyItem;
                            if (storyItem != null) {
                                arrayList6.add(storyItem);
                                i9++;
                            }
                        }
                    } else {
                        i9 = 0;
                    }
                    profileActivity.K.L(false);
                    if (z12) {
                        profileActivity.K.Y0(8);
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
                        profileActivity.t5 = new org.telegram.messenger.q8(profileActivity, clientUserId, arrayList6, z13, 9);
                        fh.m1 m1Var = new fh.m1(profileActivity, zArr3, arrayList6, zArr2, clientUserId, 15);
                        (z13 ? oc.a0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i9, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), m1Var).j() : oc.a0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i9, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, m1Var).j()).v = new ys0(18, profileActivity, zArr3);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    hz0 hz0Var3 = profileActivity.K;
                    int h12 = hz0Var3.h1(hz0Var3.getClosestTab());
                    String w8 = profileActivity.getMessagesController().getStoriesController().w(h12, a2);
                    org.telegram.messenger.q8 q8Var2 = profileActivity.t5;
                    if (q8Var2 != null) {
                        q8Var2.run();
                        profileActivity.t5 = null;
                    }
                    gc.e();
                    ArrayList arrayList7 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.K.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i21 = 0; i21 < actionModeSelected2.size(); i21++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i21).storyItem;
                            if (storyItem3 != null) {
                                arrayList7.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.K.L(false);
                    if (!arrayList7.isEmpty()) {
                        c9 c9Var = new c9(profileActivity, a2, h12, arrayList7, 14);
                        profileActivity.getMessagesController().getStoriesController().c0(h12, a2, arrayList7);
                        oc.a0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList7.size(), w8)), LocaleController.getString(R.string.UndoNoCaps), c9Var).j();
                        break;
                    }
                }
                break;
            case 24:
                s91 s91Var = (s91) obj;
                s91Var.e0.D(i14);
                s91Var.l0(i14, true);
                break;
            case 25:
                ((qh.x1) obj).L.Y3(i14);
                break;
            case 26:
                View.OnClickListener onClickListener = ((rg.e) obj).b[i14];
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                rg.a aVar = ((rg.g) obj).h;
                if (aVar != null) {
                    aVar.k(i14);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z0(MessageObject messageObject, int i9) {
        this.a = 22;
        this.b = i9;
        this.c = messageObject;
    }
}
