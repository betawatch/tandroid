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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o00(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        g70 g70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i10 = this.a;
        int i11 = 2;
        Object obj = this.b;
        switch (i10) {
            case 0:
                f10 f10Var = (f10) obj;
                AndroidUtilities.cancelRunOnUIThread(f10Var.j0);
                f10Var.a.a(false, true);
                break;
            case 1:
                f10 f10Var2 = ((u00) obj).a;
                f10Var2.h(f10Var2.A, f10Var2.B, f10Var2.D, f10Var2.C, f10Var2.y, f10Var2.F, f10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((gh.f1) obj).U2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                h10 h10Var = (h10) obj;
                h10Var.s.a();
                h10Var.n.invalidate();
                h10Var.A.Y(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((o10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i9 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i9 = 1;
                                filtersSetupActivity2.e = true;
                                filtersSetupActivity2.Y(true);
                            }
                            filtersSetupActivity.a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i9);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i9];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new g10(filtersSetupActivity, i11)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                o50 o50Var = ((v20) obj).b;
                o50Var.f2 = null;
                o50Var.J1(o50Var.B1, true);
                break;
            case 6:
                w40 w40Var = (w40) obj;
                o50 o50Var2 = w40Var.f;
                i30 i30Var = o50Var2.b;
                ImageLocation imageLocation = w40Var.d;
                if (imageLocation != null) {
                    i30Var.G0 = imageLocation;
                    i30Var.m1 = null;
                    i30Var.n1 = null;
                    w40Var.d = null;
                }
                TLRPC.Chat chat = o50Var2.d.getMessagesController().getChat(Long.valueOf(-w40Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(w40Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(w40Var.c);
                }
                i30Var.setCreateThumbFromParent(false);
                i30Var.H(null, forChat, forChat2, true);
                w40Var.c = null;
                w40Var.b = null;
                AndroidUtilities.updateVisibleRows(o50Var2.M);
                w40Var.a(1.0f);
                break;
            case 7:
                fh.l2 l2Var = ((z40) obj).g;
                if (l2Var != null) {
                    l2Var.invalidate();
                    break;
                }
                break;
            case 8:
                r60 r60Var = (r60) obj;
                r60Var.y = null;
                r60Var.A = null;
                r60Var.B = null;
                r60Var.C = null;
                r60Var.E = null;
                r60Var.D = null;
                r60Var.F = 0.0d;
                r60Var.Y(false, true);
                r60Var.d.h(null, null, r60Var.r, null);
                r60Var.f.setAnimation(r60Var.N);
                r60Var.N.K(0);
                break;
            case 9:
                org.telegram.messenger.l0.p(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.oc.a0(((u60) obj).c), R.raw.done, 36);
                break;
            case 10:
                i70 i70Var = (i70) obj;
                g70 g70Var2 = i70Var.E;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.f6.d6;
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i17, false);
                int i18 = g70.y;
                g70Var2.b(i16, 17, w02, true);
                int[] iArr = i70Var.E.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                g70 g70Var3 = i70Var.E;
                g70Var3.c(g70Var3.v, 23, true);
                int[] iArr2 = i70Var.E.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
                break;
            case 11:
                e70 e70Var = (e70) obj;
                e70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                i70 i70Var2 = (i70) e70Var.b;
                Intro.setPage(i70Var2.D);
                Intro.setDate((currentTimeMillis - i70Var2.F) / 1000.0f);
                Intro.onDrawFrame(0);
                g70 g70Var4 = i70Var2.E;
                if (g70Var4 != null && g70Var4.isAlive() && (eGLDisplay = (g70Var = i70Var2.E).c) != null && (eGLSurface = g70Var.f) != null) {
                    try {
                        g70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                i70 i70Var3 = ((f70) obj).b;
                i70Var3.presentFragment(new fg0(), true);
                i70Var3.I = true;
                break;
            case 13:
                ((g70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((ve.d) obj).b();
                break;
            case 15:
                ((ca0) obj).a.y0.setVisibility(8);
                break;
            case 16:
                ((ib0) obj).f0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.wk0 currentListView = ((nc0) obj).u0.G0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((vd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                yd0 yd0Var = (yd0) obj;
                org.telegram.ui.Components.pi0 pi0Var = yd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = yd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fg0.T0(yd0Var.y, editTextBoldCursor2);
                    pi0Var.getAnimatedDrawable().L(0, false, false);
                    pi0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.pi0) obj).d();
                break;
            case 21:
                ((ge0) ((fg.g) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                ge0 ge0Var = ((fe0) obj).a;
                double d = ge0Var.M;
                hf0 hf0Var = ge0Var.v;
                ge0Var.M = currentTimeMillis2;
                int i19 = (int) (ge0Var.L - (currentTimeMillis2 - d));
                ge0Var.L = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    hf0Var.setTextSize(1, 13.0f);
                    int i23 = ge0Var.A;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            hf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            break;
                        }
                    } else {
                        hf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                        break;
                    }
                } else {
                    ge0Var.r();
                    int i24 = ge0Var.A;
                    if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                        hf0Var.setTextSize(1, 15.0f);
                        int i25 = ge0Var.A;
                        if (i25 == 4) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i25 == 15) {
                            hf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i25 == 11 || i25 == 3) {
                            hf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i26 = org.telegram.ui.ActionBar.f6.P9;
                        hf0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i26, false));
                        hf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                jf0 jf0Var = (jf0) ((kh.j2) obj).b;
                double d9 = currentTimeMillis3 - jf0Var.U;
                jf0Var.U = currentTimeMillis3;
                int i27 = (int) (jf0Var.S - d9);
                jf0Var.S = i27;
                if (i27 <= 1000) {
                    jf0Var.setProblemTextVisible(true);
                    jf0Var.v.setVisibility(8);
                    hf0 hf0Var2 = jf0Var.x;
                    if (hf0Var2 != null) {
                        hf0Var2.setVisibility(0);
                    }
                    jf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                jf0 jf0Var2 = ((if0) obj).a;
                double d10 = jf0Var2.T;
                hf0 hf0Var3 = jf0Var2.v;
                jf0Var2.T = currentTimeMillis4;
                int i28 = (int) (jf0Var2.R - (currentTimeMillis4 - d10));
                jf0Var2.R = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = jf0Var2.c0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (jf0Var2.b0 != 2 || (i32 != 2 && i32 != 17 && i32 != 16)) {
                            if (i32 == 2 || i32 == 17 || i32 == 16) {
                                hf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                                break;
                            }
                        } else {
                            hf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            break;
                        }
                    } else {
                        hf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                        break;
                    }
                } else {
                    jf0Var2.w();
                    int i33 = jf0Var2.c0;
                    if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                        if (i33 == 4) {
                            hf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i33 == 11 || i33 == 3) {
                            hf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            hf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i34 = org.telegram.ui.ActionBar.f6.P9;
                        hf0Var3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i34, false));
                        hf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.no0) obj).run();
                break;
            case 26:
                ((pg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.ji) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((nj0) ((g) obj).b).M);
                break;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
