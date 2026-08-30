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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        t70 t70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                t10 t10Var = (t10) obj;
                AndroidUtilities.cancelRunOnUIThread(t10Var.k0);
                t10Var.a.a(false, true);
                break;
            case 1:
                t10 t10Var2 = ((i10) obj).a;
                t10Var2.h(t10Var2.B, t10Var2.C, t10Var2.E, t10Var2.D, t10Var2.y, t10Var2.G, t10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((lh.e1) obj).V2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.s.a();
                v10Var.n.invalidate();
                v10Var.B.Z(true);
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
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(filtersSetupActivity);
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
                c60 c60Var = ((l30) obj).b;
                c60Var.g2 = null;
                c60Var.J1(c60Var.C1, true);
                break;
            case 6:
                k50 k50Var = (k50) obj;
                c60 c60Var2 = k50Var.f;
                x30 x30Var = c60Var2.b;
                ImageLocation imageLocation = k50Var.d;
                if (imageLocation != null) {
                    x30Var.H0 = imageLocation;
                    x30Var.n1 = null;
                    x30Var.o1 = null;
                    k50Var.d = null;
                }
                TLRPC.Chat chat = c60Var2.d.getMessagesController().getChat(Long.valueOf(-k50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(k50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(k50Var.c);
                }
                x30Var.setCreateThumbFromParent(false);
                x30Var.H(null, forChat, forChat2, true);
                k50Var.c = null;
                k50Var.b = null;
                AndroidUtilities.updateVisibleRows(c60Var2.N);
                k50Var.a(1.0f);
                break;
            case 7:
                eg.h0 h0Var = ((n50) obj).g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 8:
                e70 e70Var = (e70) obj;
                e70Var.y = null;
                e70Var.B = null;
                e70Var.C = null;
                e70Var.D = null;
                e70Var.F = null;
                e70Var.E = null;
                e70Var.G = 0.0d;
                e70Var.Z(false, true);
                e70Var.d.h(null, null, e70Var.r, null);
                e70Var.f.setAnimation(e70Var.O);
                e70Var.O.K(0);
                break;
            case 9:
                kh.a2.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((h70) obj).c), R.raw.done, 36);
                break;
            case 10:
                u70 u70Var = (u70) obj;
                t70 t70Var2 = u70Var.F;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.j6.d6;
                int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                int i19 = t70.y;
                t70Var2.b(i17, 17, w02, true);
                int[] iArr = u70Var.F.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                t70 t70Var3 = u70Var.F;
                t70Var3.c(t70Var3.v, 23, true);
                int[] iArr2 = u70Var.F.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                break;
            case 11:
                r70 r70Var = (r70) obj;
                r70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                u70 u70Var2 = (u70) r70Var.b;
                Intro.setPage(u70Var2.E);
                Intro.setDate((currentTimeMillis - u70Var2.G) / 1000.0f);
                Intro.onDrawFrame(0);
                t70 t70Var4 = u70Var2.F;
                if (t70Var4 != null && t70Var4.isAlive() && (eGLDisplay = (t70Var = u70Var2.F).c) != null && (eGLSurface = t70Var.f) != null) {
                    try {
                        t70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                u70 u70Var3 = ((s70) obj).b;
                u70Var3.presentFragment(new ng0(), true);
                u70Var3.J = true;
                break;
            case 13:
                ((t70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((af.f) obj).b();
                break;
            case 15:
                ((na0) obj).a.z0.setVisibility(8);
                break;
            case 16:
                ((ub0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.sl0 currentListView = ((yc0) obj).v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((de0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                he0 he0Var = (he0) obj;
                org.telegram.ui.Components.jj0 jj0Var = he0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = he0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ng0.T0(he0Var.y, editTextBoldCursor2);
                    jj0Var.getAnimatedDrawable().L(0, false, false);
                    jj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.jj0) obj).d();
                break;
            case 21:
                ((pe0) ((kg.f) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                pe0 pe0Var = ((oe0) obj).a;
                double d = pe0Var.N;
                pf0 pf0Var = pe0Var.v;
                pe0Var.N = currentTimeMillis2;
                int i20 = (int) (pe0Var.M - (currentTimeMillis2 - d));
                pe0Var.M = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    pf0Var.setTextSize(1, 13.0f);
                    int i24 = pe0Var.B;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            pf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        pf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    pe0Var.r();
                    int i25 = pe0Var.B;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        pf0Var.setTextSize(1, 15.0f);
                        int i26 = pe0Var.B;
                        if (i26 == 4) {
                            pf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            pf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            pf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            pf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.j6.P9;
                        pf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                        pf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                rf0 rf0Var = (rf0) ((org.telegram.ui.Components.g50) obj).b;
                double d10 = currentTimeMillis3 - rf0Var.V;
                rf0Var.V = currentTimeMillis3;
                int i28 = (int) (rf0Var.T - d10);
                rf0Var.T = i28;
                if (i28 <= 1000) {
                    rf0Var.setProblemTextVisible(true);
                    rf0Var.v.setVisibility(8);
                    pf0 pf0Var2 = rf0Var.x;
                    if (pf0Var2 != null) {
                        pf0Var2.setVisibility(0);
                    }
                    rf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                rf0 rf0Var2 = ((qf0) obj).a;
                double d11 = rf0Var2.U;
                pf0 pf0Var3 = rf0Var2.v;
                rf0Var2.U = currentTimeMillis4;
                int i29 = (int) (rf0Var2.S - (currentTimeMillis4 - d11));
                rf0Var2.S = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = rf0Var2.d0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (rf0Var2.c0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                pf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            pf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        pf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    rf0Var2.w();
                    int i34 = rf0Var2.d0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            pf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            pf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            pf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.j6.P9;
                        pf0Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i35, false));
                        pf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((a30) obj).run();
                break;
            case 26:
                ((xg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.ki) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((sj0) ((h) obj).b).N);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
