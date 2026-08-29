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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        j70 j70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                h10 h10Var = (h10) obj;
                AndroidUtilities.cancelRunOnUIThread(h10Var.j0);
                h10Var.a.a(false, true);
                break;
            case 1:
                h10 h10Var2 = ((w00) obj).a;
                h10Var2.h(h10Var2.A, h10Var2.B, h10Var2.D, h10Var2.C, h10Var2.y, h10Var2.F, h10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((jh.e1) obj).U2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                j10 j10Var = (j10) obj;
                j10Var.s.a();
                j10Var.n.invalidate();
                j10Var.A.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((q10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i13 = 0; i13 < dialogFilters.size(); i13++) {
                        if (dialogFilters.get(i13).isDefault() && i13 != 0) {
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
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new i10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                r50 r50Var = ((z20) obj).b;
                r50Var.f2 = null;
                r50Var.J1(r50Var.B1, true);
                break;
            case 6:
                y40 y40Var = (y40) obj;
                r50 r50Var2 = y40Var.f;
                l30 l30Var = r50Var2.b;
                ImageLocation imageLocation = y40Var.d;
                if (imageLocation != null) {
                    l30Var.G0 = imageLocation;
                    l30Var.m1 = null;
                    l30Var.n1 = null;
                    y40Var.d = null;
                }
                TLRPC.Chat chat = r50Var2.d.getMessagesController().getChat(Long.valueOf(-y40Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(y40Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(y40Var.c);
                }
                l30Var.setCreateThumbFromParent(false);
                l30Var.H(null, forChat, forChat2, true);
                y40Var.c = null;
                y40Var.b = null;
                AndroidUtilities.updateVisibleRows(r50Var2.M);
                y40Var.a(1.0f);
                break;
            case 7:
                cg.h0 h0Var = ((b50) obj).g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 8:
                t60 t60Var = (t60) obj;
                t60Var.y = null;
                t60Var.A = null;
                t60Var.B = null;
                t60Var.C = null;
                t60Var.E = null;
                t60Var.D = null;
                t60Var.F = 0.0d;
                t60Var.Z(false, true);
                t60Var.d.h(null, null, t60Var.r, null);
                t60Var.f.setAnimation(t60Var.N);
                t60Var.N.K(0);
                break;
            case 9:
                j7.l1.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.tc.a0(((w60) obj).c), R.raw.done, 36);
                break;
            case 10:
                k70 k70Var = (k70) obj;
                j70 j70Var2 = k70Var.E;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.g6.d6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i18, false);
                int i19 = j70.y;
                j70Var2.b(i17, 17, w02, true);
                int[] iArr = k70Var.E.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                j70 j70Var3 = k70Var.E;
                j70Var3.c(j70Var3.v, 23, true);
                int[] iArr2 = k70Var.E.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                break;
            case 11:
                h70 h70Var = (h70) obj;
                h70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                k70 k70Var2 = (k70) h70Var.b;
                Intro.setPage(k70Var2.D);
                Intro.setDate((currentTimeMillis - k70Var2.F) / 1000.0f);
                Intro.onDrawFrame(0);
                j70 j70Var4 = k70Var2.E;
                if (j70Var4 != null && j70Var4.isAlive() && (eGLDisplay = (j70Var = k70Var2.E).c) != null && (eGLSurface = j70Var.f) != null) {
                    try {
                        j70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                k70 k70Var3 = ((i70) obj).b;
                k70Var3.presentFragment(new fg0(), true);
                k70Var3.I = true;
                break;
            case 13:
                ((j70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((ye.c) obj).b();
                break;
            case 15:
                ((fa0) obj).a.y0.setVisibility(8);
                break;
            case 16:
                ((kb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.jl0 currentListView = ((pc0) obj).u0.G0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ud0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                xd0 xd0Var = (xd0) obj;
                org.telegram.ui.Components.aj0 aj0Var = xd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = xd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fg0.T0(xd0Var.y, editTextBoldCursor2);
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.aj0) obj).d();
                break;
            case 21:
                ((fe0) ((ig.f) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                fe0 fe0Var = ((ee0) obj).a;
                double d = fe0Var.M;
                gf0 gf0Var = fe0Var.v;
                fe0Var.M = currentTimeMillis2;
                int i20 = (int) (fe0Var.L - (currentTimeMillis2 - d));
                fe0Var.L = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    gf0Var.setTextSize(1, 13.0f);
                    int i24 = fe0Var.A;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            gf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        gf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    fe0Var.r();
                    int i25 = fe0Var.A;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        gf0Var.setTextSize(1, 15.0f);
                        int i26 = fe0Var.A;
                        if (i26 == 4) {
                            gf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            gf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            gf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            gf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.g6.P9;
                        gf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i27, false));
                        gf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                if0 if0Var = (if0) ((nh.g2) obj).b;
                double d10 = currentTimeMillis3 - if0Var.U;
                if0Var.U = currentTimeMillis3;
                int i28 = (int) (if0Var.S - d10);
                if0Var.S = i28;
                if (i28 <= 1000) {
                    if0Var.setProblemTextVisible(true);
                    if0Var.v.setVisibility(8);
                    gf0 gf0Var2 = if0Var.x;
                    if (gf0Var2 != null) {
                        gf0Var2.setVisibility(0);
                    }
                    if0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                if0 if0Var2 = ((hf0) obj).a;
                double d11 = if0Var2.T;
                gf0 gf0Var3 = if0Var2.v;
                if0Var2.T = currentTimeMillis4;
                int i29 = (int) (if0Var2.R - (currentTimeMillis4 - d11));
                if0Var2.R = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = if0Var2.c0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (if0Var2.b0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                gf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            gf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        gf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    if0Var2.w();
                    int i34 = if0Var2.c0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            gf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            gf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            gf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.g6.P9;
                        gf0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i35, false));
                        gf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((n20) obj).run();
                break;
            case 26:
                ((pg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.mi) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((kj0) ((h) obj).b).M);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
