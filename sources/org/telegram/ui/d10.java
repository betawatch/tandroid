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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        v70 v70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                u10 u10Var = (u10) obj;
                AndroidUtilities.cancelRunOnUIThread(u10Var.k0);
                u10Var.a.a(false, true);
                break;
            case 1:
                u10 u10Var2 = ((j10) obj).a;
                u10Var2.h(u10Var2.B, u10Var2.C, u10Var2.E, u10Var2.D, u10Var2.y, u10Var2.G, u10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((lh.e1) obj).V2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                x10 x10Var = (x10) obj;
                x10Var.s.a();
                x10Var.n.invalidate();
                x10Var.B.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((e20) obj).d;
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
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new v10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                e60 e60Var = ((n30) obj).b;
                e60Var.g2 = null;
                e60Var.J1(e60Var.C1, true);
                break;
            case 6:
                m50 m50Var = (m50) obj;
                e60 e60Var2 = m50Var.f;
                z30 z30Var = e60Var2.b;
                ImageLocation imageLocation = m50Var.d;
                if (imageLocation != null) {
                    z30Var.H0 = imageLocation;
                    z30Var.n1 = null;
                    z30Var.o1 = null;
                    m50Var.d = null;
                }
                TLRPC.Chat chat = e60Var2.d.getMessagesController().getChat(Long.valueOf(-m50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(m50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(m50Var.c);
                }
                z30Var.setCreateThumbFromParent(false);
                z30Var.H(null, forChat, forChat2, true);
                m50Var.c = null;
                m50Var.b = null;
                AndroidUtilities.updateVisibleRows(e60Var2.N);
                m50Var.a(1.0f);
                break;
            case 7:
                eg.h0 h0Var = ((p50) obj).g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 8:
                g70 g70Var = (g70) obj;
                g70Var.y = null;
                g70Var.B = null;
                g70Var.C = null;
                g70Var.D = null;
                g70Var.F = null;
                g70Var.E = null;
                g70Var.G = 0.0d;
                g70Var.Z(false, true);
                g70Var.d.h(null, null, g70Var.r, null);
                g70Var.f.setAnimation(g70Var.O);
                g70Var.O.K(0);
                break;
            case 9:
                kf.k0.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((j70) obj).c), R.raw.done, 36);
                break;
            case 10:
                w70 w70Var = (w70) obj;
                v70 v70Var2 = w70Var.F;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                int i19 = v70.y;
                v70Var2.b(i17, 17, w02, true);
                int[] iArr = w70Var.F.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                v70 v70Var3 = w70Var.F;
                v70Var3.c(v70Var3.v, 23, true);
                int[] iArr2 = w70Var.F.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                break;
            case 11:
                t70 t70Var = (t70) obj;
                t70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                w70 w70Var2 = (w70) t70Var.b;
                Intro.setPage(w70Var2.E);
                Intro.setDate((currentTimeMillis - w70Var2.G) / 1000.0f);
                Intro.onDrawFrame(0);
                v70 v70Var4 = w70Var2.F;
                if (v70Var4 != null && v70Var4.isAlive() && (eGLDisplay = (v70Var = w70Var2.F).c) != null && (eGLSurface = v70Var.f) != null) {
                    try {
                        v70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                w70 w70Var3 = ((u70) obj).b;
                w70Var3.presentFragment(new pg0(), true);
                w70Var3.J = true;
                break;
            case 13:
                ((v70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((ze.c) obj).b();
                break;
            case 15:
                ((pa0) obj).a.z0.setVisibility(8);
                break;
            case 16:
                ((wb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.rl0 currentListView = ((ad0) obj).v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((fe0) obj).b;
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
                org.telegram.ui.Components.jj0 jj0Var = je0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = je0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    pg0.T0(je0Var.y, editTextBoldCursor2);
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.jj0) obj).d();
                break;
            case 21:
                ((re0) ((kg.f) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                re0 re0Var = ((qe0) obj).a;
                double d = re0Var.N;
                rf0 rf0Var = re0Var.v;
                re0Var.N = currentTimeMillis2;
                int i20 = (int) (re0Var.M - (currentTimeMillis2 - d));
                re0Var.M = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    rf0Var.setTextSize(1, 13.0f);
                    int i24 = re0Var.B;
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
                    int i25 = re0Var.B;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        rf0Var.setTextSize(1, 15.0f);
                        int i26 = re0Var.B;
                        if (i26 == 4) {
                            rf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            rf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            rf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            rf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.j6.P9;
                        rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                        rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                tf0 tf0Var = (tf0) ((org.telegram.ui.Components.h50) obj).b;
                double d10 = currentTimeMillis3 - tf0Var.V;
                tf0Var.V = currentTimeMillis3;
                int i28 = (int) (tf0Var.T - d10);
                tf0Var.T = i28;
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
                double d11 = tf0Var2.U;
                rf0 rf0Var3 = tf0Var2.v;
                tf0Var2.U = currentTimeMillis4;
                int i29 = (int) (tf0Var2.S - (currentTimeMillis4 - d11));
                tf0Var2.S = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = tf0Var2.d0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (tf0Var2.c0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
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
                    int i34 = tf0Var2.d0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            rf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            rf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            rf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.j6.P9;
                        rf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                        rf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((c30) obj).run();
                break;
            case 26:
                ((zg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.ki) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((uj0) ((h) obj).b).N);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
