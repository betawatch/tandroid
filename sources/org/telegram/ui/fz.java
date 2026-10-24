package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        l70 l70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((mz) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                i10 i10Var = (i10) obj;
                AndroidUtilities.cancelRunOnUIThread(i10Var.n0);
                i10Var.a.a(false, true);
                break;
            case 2:
                i10 i10Var2 = ((w00) obj).a;
                i10Var2.h(i10Var2.E, i10Var2.F, i10Var2.H, i10Var2.G, i10Var2.y, i10Var2.J, i10Var2.w, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((k10) obj).Z2).getMessagesController().lockFiltersInternal();
                break;
            case 4:
                l10 l10Var = (l10) obj;
                l10Var.s.a();
                l10Var.n.invalidate();
                l10Var.H.b0(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((s10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i13 = 0;
                    while (true) {
                        if (i13 < dialogFilters.size()) {
                            if (!dialogFilters.get(i13).isDefault() || i13 == 0) {
                                i13++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                                if (i13 < 0 || i13 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, arrayList.remove(i13));
                                    for (int i14 = 0; i14 <= i13; i14++) {
                                        arrayList.get(i14).order = i14;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.b0(true);
                                }
                                filtersSetupActivity.a.u0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(filtersSetupActivity);
                                int i15 = R.raw.filter_reorder;
                                int i16 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new j10(filtersSetupActivity, i12)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.a0(null);
                break;
            case 6:
                u50 u50Var = ((a30) obj).b;
                u50Var.j2 = null;
                u50Var.K1(u50Var.F1, true);
                break;
            case 7:
                b50 b50Var = (b50) obj;
                u50 u50Var2 = b50Var.f;
                m30 m30Var = u50Var2.b;
                ImageLocation imageLocation = b50Var.d;
                if (imageLocation != null) {
                    m30Var.K0 = imageLocation;
                    m30Var.q1 = null;
                    m30Var.r1 = null;
                    b50Var.d = null;
                }
                TLRPC.Chat chat = u50Var2.d.getMessagesController().getChat(Long.valueOf(-b50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(b50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(b50Var.c);
                }
                m30Var.setCreateThumbFromParent(false);
                m30Var.H(null, forChat, forChat2, true);
                b50Var.c = null;
                b50Var.b = null;
                AndroidUtilities.updateVisibleRows(u50Var2.Q);
                b50Var.a(1.0f);
                break;
            case 8:
                e50 e50Var = ((f50) obj).g;
                if (e50Var != null) {
                    e50Var.invalidate();
                    break;
                }
                break;
            case 9:
                w60 w60Var = (w60) obj;
                w60Var.y = null;
                w60Var.E = null;
                w60Var.F = null;
                w60Var.G = null;
                w60Var.I = null;
                w60Var.H = null;
                w60Var.J = 0.0d;
                w60Var.Z(false, true);
                w60Var.d.h(null, null, w60Var.r, null);
                w60Var.f.setAnimation(w60Var.R);
                w60Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.v0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.xc.a0(((z60) obj).c), R.raw.done, 36);
                break;
            case 11:
                n70 n70Var = (n70) obj;
                l70 l70Var2 = n70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.k6.d6;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                int i19 = l70.y;
                l70Var2.b(i17, 17, x02, true);
                n70Var.I.d();
                l70 l70Var3 = n70Var.I;
                l70Var3.c(l70Var3.v, 23, true);
                n70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                break;
            case 12:
                j70 j70Var = (j70) obj;
                j70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                n70 n70Var2 = (n70) j70Var.b;
                Intro.setPage(n70Var2.H);
                Intro.setDate((currentTimeMillis - n70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                l70 l70Var4 = n70Var2.I;
                if (l70Var4 != null && l70Var4.isAlive() && (eGLDisplay = (l70Var = n70Var2.I).c) != null && (eGLSurface = l70Var.f) != null) {
                    try {
                        l70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                n70 n70Var3 = ((k70) obj).b;
                n70Var3.presentFragment(new ig0(), true);
                n70Var3.M = true;
                break;
            case 14:
                ((l70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                ((pf.c) obj).b();
                break;
            case 16:
                ga0 ga0Var = (ga0) obj;
                LaunchActivity launchActivity = ga0Var.c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    ga0Var.requestLayout();
                    break;
                }
                break;
            case 17:
                ((ha0) obj).a.C0.setVisibility(8);
                break;
            case 18:
                mb0 mb0Var = (mb0) obj;
                zh.c1 c1Var = mb0Var.d;
                if (c1Var != null) {
                    mb0Var.d0(c1Var.getCurrentLink());
                    break;
                }
                break;
            case 19:
                try {
                    org.telegram.ui.Components.mm0 currentListView = ((sc0) ((qc0) obj).z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((xd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 21:
                be0 be0Var = (be0) obj;
                org.telegram.ui.Components.bk0 bk0Var = be0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = be0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ig0.V0(be0Var.y, editTextBoldCursor2);
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.d();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.bk0) obj).d();
                break;
            case 23:
                ((je0) ((ei.e2) obj).c).getClass();
                break;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                je0 je0Var = ((ie0) obj).a;
                double d = je0Var.Q;
                kf0 kf0Var = je0Var.v;
                je0Var.Q = currentTimeMillis2;
                int i20 = (int) (je0Var.P - (currentTimeMillis2 - d));
                je0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    kf0Var.setTextSize(1, 13.0f);
                    int i24 = je0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            kf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        kf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    je0Var.q();
                    int i25 = je0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        kf0Var.setTextSize(1, 15.0f);
                        int i26 = je0Var.E;
                        if (i26 == 4) {
                            kf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            kf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            kf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            kf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.W(kf0Var, i27, null);
                        kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                mf0 mf0Var = (mf0) ((e6.r) obj).b;
                double d10 = currentTimeMillis3 - mf0Var.d0;
                mf0Var.d0 = currentTimeMillis3;
                int i28 = (int) (mf0Var.b0 - d10);
                mf0Var.b0 = i28;
                if (i28 <= 1000) {
                    mf0Var.setProblemTextVisible(true);
                    mf0Var.v.setVisibility(8);
                    kf0 kf0Var2 = mf0Var.x;
                    if (kf0Var2 != null) {
                        kf0Var2.setVisibility(0);
                    }
                    mf0Var.t();
                    break;
                }
                break;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                mf0 mf0Var2 = ((lf0) obj).a;
                double d11 = mf0Var2.c0;
                kf0 kf0Var3 = mf0Var2.v;
                mf0Var2.c0 = currentTimeMillis4;
                int i29 = (int) (mf0Var2.a0 - (currentTimeMillis4 - d11));
                mf0Var2.a0 = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = mf0Var2.i0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (mf0Var2.h0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                kf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            kf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        kf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    mf0Var2.u();
                    int i34 = mf0Var2.i0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            kf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            kf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            kf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.k6.P9;
                        org.telegram.ui.ActionBar.r6.W(kf0Var3, i35, null);
                        kf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 27:
                ((org.telegram.ui.Components.j90) obj).run();
                break;
            case 28:
                ((tg0) obj).setSkipDrawSelector(false);
                break;
            default:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                break;
        }
    }
}
