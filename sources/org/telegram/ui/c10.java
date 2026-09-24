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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        w70 w70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                t10 t10Var = (t10) obj;
                AndroidUtilities.cancelRunOnUIThread(t10Var.n0);
                t10Var.a.a(false, true);
                break;
            case 1:
                t10 t10Var2 = ((i10) obj).a;
                t10Var2.h(t10Var2.E, t10Var2.F, t10Var2.H, t10Var2.G, t10Var2.y, t10Var2.J, t10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((ai.w0) obj).Y2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.s.a();
                v10Var.n.invalidate();
                v10Var.E.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((c20) obj).d;
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
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new u10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                d60 d60Var = ((l30) obj).b;
                d60Var.j2 = null;
                d60Var.J1(d60Var.F1, true);
                break;
            case 6:
                k50 k50Var = (k50) obj;
                d60 d60Var2 = k50Var.f;
                x30 x30Var = d60Var2.b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.K0 = imageLocation;
                    x30Var.q1 = null;
                    x30Var.r1 = null;
                    k50Var.d = null;
                }
                TLRPC.Chat chat = d60Var2.d.getMessagesController().getChat(Long.valueOf(-k50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(k50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(k50Var.c);
                }
                x30Var.setCreateThumbFromParent(false);
                x30Var.H(null, forChat, forChat2, true);
                k50Var.c = null;
                k50Var.b = null;
                AndroidUtilities.updateVisibleRows(d60Var2.Q);
                k50Var.a(1.0f);
                break;
            case 7:
                n50 n50Var = ((o50) obj).g;
                if (n50Var != null) {
                    n50Var.invalidate();
                    break;
                }
                break;
            case 8:
                g70 g70Var = (g70) obj;
                g70Var.y = null;
                g70Var.E = null;
                g70Var.F = null;
                g70Var.G = null;
                g70Var.I = null;
                g70Var.H = null;
                g70Var.J = 0.0d;
                g70Var.Z(false, true);
                g70Var.d.h(null, null, g70Var.r, null);
                g70Var.f.setAnimation(g70Var.R);
                g70Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.f0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.yc.a0(((j70) obj).c), R.raw.done, 36);
                break;
            case 10:
                y70 y70Var = (y70) obj;
                w70 w70Var2 = y70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.h6.d6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(null, i18, false);
                int i19 = w70.y;
                w70Var2.b(i17, 17, w02, true);
                int[] iArr = y70Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                w70 w70Var3 = y70Var.I;
                w70Var3.c(w70Var3.v, 23, true);
                int[] iArr2 = y70Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i18, false));
                break;
            case 11:
                u70 u70Var = (u70) obj;
                u70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                y70 y70Var2 = (y70) u70Var.b;
                Intro.setPage(y70Var2.H);
                Intro.setDate((currentTimeMillis - y70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                w70 w70Var4 = y70Var2.I;
                if (w70Var4 != null && w70Var4.isAlive() && (eGLDisplay = (w70Var = y70Var2.I).c) != null && (eGLSurface = w70Var.f) != null) {
                    try {
                        w70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                y70 y70Var3 = ((v70) obj).b;
                y70Var3.presentFragment(new qg0(), true);
                y70Var3.M = true;
                break;
            case 13:
                ((w70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((nf.e) obj).b();
                break;
            case 15:
                ((ra0) obj).a.C0.setVisibility(8);
                break;
            case 16:
                ((xb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.wl0 currentListView = ((ad0) obj).y0.K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ge0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                je0 je0Var = (je0) obj;
                org.telegram.ui.Components.lj0 lj0Var = je0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = je0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    qg0.T0(je0Var.y, editTextBoldCursor2);
                    lj0Var.getAnimatedDrawable().N(0, false, false);
                    lj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.lj0) obj).d();
                break;
            case 21:
                ((re0) ((ci.h2) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                re0 re0Var = ((qe0) obj).a;
                double d = re0Var.Q;
                rf0 rf0Var = re0Var.v;
                re0Var.Q = currentTimeMillis2;
                int i20 = (int) (re0Var.P - (currentTimeMillis2 - d));
                re0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    rf0Var.setTextSize(1, 13.0f);
                    int i24 = re0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            rf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        rf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    re0Var.r();
                    int i25 = re0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        rf0Var.setTextSize(1, 15.0f);
                        int i26 = re0Var.E;
                        if (i26 == 4) {
                            rf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            rf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            rf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            rf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.h6.P9;
                        rf0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i27, false));
                        rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                tf0 tf0Var = (tf0) ((ci.o2) obj).b;
                double d10 = currentTimeMillis3 - tf0Var.b0;
                tf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (tf0Var.W - d10);
                tf0Var.W = i28;
                if (i28 <= 1000) {
                    tf0Var.setProblemTextVisible(true);
                    tf0Var.v.setVisibility(8);
                    rf0 rf0Var2 = tf0Var.x;
                    if (rf0Var2 != null) {
                        rf0Var2.setVisibility(0);
                    }
                    tf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                tf0 tf0Var2 = ((sf0) obj).a;
                double d11 = tf0Var2.a0;
                rf0 rf0Var3 = tf0Var2.v;
                tf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (tf0Var2.V - (currentTimeMillis4 - d11));
                tf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = tf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (tf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                rf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            rf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        rf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    tf0Var2.w();
                    int i34 = tf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            rf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            rf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            rf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.h6.P9;
                        rf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i35, false));
                        rf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.vn0) obj).run();
                break;
            case 26:
                ((ah0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.vi) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((wj0) ((g) obj).b).Q);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
