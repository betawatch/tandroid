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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        u70 u70Var;
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
                ((FiltersSetupActivity) ((mh.d1) obj).V2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                v10 v10Var = (v10) obj;
                v10Var.s.a();
                v10Var.n.invalidate();
                v10Var.B.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((d20) obj).d;
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
                d60 d60Var = ((m30) obj).b;
                d60Var.g2 = null;
                d60Var.J1(d60Var.C1, true);
                break;
            case 6:
                l50 l50Var = (l50) obj;
                d60 d60Var2 = l50Var.f;
                y30 y30Var = d60Var2.b;
                ImageLocation imageLocation = l50Var.d;
                if (imageLocation != null) {
                    y30Var.H0 = imageLocation;
                    y30Var.n1 = null;
                    y30Var.o1 = null;
                    l50Var.d = null;
                }
                TLRPC.Chat chat = d60Var2.d.getMessagesController().getChat(Long.valueOf(-l50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(l50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(l50Var.c);
                }
                y30Var.setCreateThumbFromParent(false);
                y30Var.H(null, forChat, forChat2, true);
                l50Var.c = null;
                l50Var.b = null;
                AndroidUtilities.updateVisibleRows(d60Var2.N);
                l50Var.a(1.0f);
                break;
            case 7:
                fg.h0 h0Var = ((o50) obj).g;
                if (h0Var != null) {
                    h0Var.invalidate();
                    break;
                }
                break;
            case 8:
                f70 f70Var = (f70) obj;
                f70Var.y = null;
                f70Var.B = null;
                f70Var.C = null;
                f70Var.D = null;
                f70Var.F = null;
                f70Var.E = null;
                f70Var.G = 0.0d;
                f70Var.Z(false, true);
                f70Var.d.h(null, null, f70Var.r, null);
                f70Var.f.setAnimation(f70Var.O);
                f70Var.O.K(0);
                break;
            case 9:
                l.d.v(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.qc.a0(((i70) obj).c), R.raw.done, 36);
                break;
            case 10:
                v70 v70Var = (v70) obj;
                u70 u70Var2 = v70Var.F;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.k6.d6;
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i18, false);
                int i19 = u70.y;
                u70Var2.b(i17, 17, w02, true);
                int[] iArr = v70Var.F.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                u70 u70Var3 = v70Var.F;
                u70Var3.c(u70Var3.v, 23, true);
                int[] iArr2 = v70Var.F.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
                break;
            case 11:
                s70 s70Var = (s70) obj;
                s70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v70 v70Var2 = (v70) s70Var.b;
                Intro.setPage(v70Var2.E);
                Intro.setDate((currentTimeMillis - v70Var2.G) / 1000.0f);
                Intro.onDrawFrame(0);
                u70 u70Var4 = v70Var2.F;
                if (u70Var4 != null && u70Var4.isAlive() && (eGLDisplay = (u70Var = v70Var2.F).c) != null && (eGLSurface = u70Var.f) != null) {
                    try {
                        u70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                v70 v70Var3 = ((t70) obj).b;
                v70Var3.presentFragment(new og0(), true);
                v70Var3.J = true;
                break;
            case 13:
                ((u70) obj).finish();
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
                ((oa0) obj).a.z0.setVisibility(8);
                break;
            case 16:
                ((vb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.sl0 currentListView = ((zc0) obj).v0.H0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ee0) obj).b;
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
                org.telegram.ui.Components.kj0 kj0Var = he0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = he0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    og0.T0(he0Var.y, editTextBoldCursor2);
                    kj0Var.getAnimatedDrawable().L(0, false, false);
                    kj0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.kj0) obj).d();
                break;
            case 21:
                ((pe0) ((lg.f) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                pe0 pe0Var = ((oe0) obj).a;
                double d = pe0Var.N;
                qf0 qf0Var = pe0Var.v;
                pe0Var.N = currentTimeMillis2;
                int i20 = (int) (pe0Var.M - (currentTimeMillis2 - d));
                pe0Var.M = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    qf0Var.setTextSize(1, 13.0f);
                    int i24 = pe0Var.B;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            qf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        qf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    pe0Var.r();
                    int i25 = pe0Var.B;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        qf0Var.setTextSize(1, 15.0f);
                        int i26 = pe0Var.B;
                        if (i26 == 4) {
                            qf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            qf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            qf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            qf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.k6.P9;
                        qf0Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i27, false));
                        qf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                sf0 sf0Var = (sf0) ((org.telegram.ui.Components.i50) obj).b;
                double d10 = currentTimeMillis3 - sf0Var.V;
                sf0Var.V = currentTimeMillis3;
                int i28 = (int) (sf0Var.T - d10);
                sf0Var.T = i28;
                if (i28 <= 1000) {
                    sf0Var.setProblemTextVisible(true);
                    sf0Var.v.setVisibility(8);
                    qf0 qf0Var2 = sf0Var.x;
                    if (qf0Var2 != null) {
                        qf0Var2.setVisibility(0);
                    }
                    sf0Var.v();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                sf0 sf0Var2 = ((rf0) obj).a;
                double d11 = sf0Var2.U;
                qf0 qf0Var3 = sf0Var2.v;
                sf0Var2.U = currentTimeMillis4;
                int i29 = (int) (sf0Var2.S - (currentTimeMillis4 - d11));
                sf0Var2.S = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = sf0Var2.d0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (sf0Var2.c0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                qf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            qf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        qf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    sf0Var2.w();
                    int i34 = sf0Var2.d0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            qf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            qf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            qf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.k6.P9;
                        qf0Var3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i35, false));
                        qf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((b30) obj).run();
                break;
            case 26:
                ((yg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.li) obj).setVisibility(8);
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
