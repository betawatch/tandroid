package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c80 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ LanguageSelectActivity e;

    public c80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.e = languageSelectActivity;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 5 || i10 == 2;
    }

    @Override // f2.q0
    public final int h() {
        int i10;
        boolean z10 = this.d;
        LanguageSelectActivity languageSelectActivity = this.e;
        if (z10) {
            ArrayList arrayList = languageSelectActivity.e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i11 = languageSelectActivity.getMessagesController().isTranslationsManualEnabled() ? 3 : 2;
            if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                i11++;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                i11++;
            }
            i10 = i11 + 1;
        } else {
            i10 = 1;
        }
        int size = languageSelectActivity.f.size() + i10 + 1;
        return !languageSelectActivity.h.isEmpty() ? languageSelectActivity.h.size() + 1 + size : size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
    
        if (r2 != ((r0.f.size() + r0.h.size()) + 1)) goto L55;
     */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (this.d) {
            return 0;
        }
        LanguageSelectActivity languageSelectActivity = this.e;
        if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
            int i12 = i10 - 1;
            if (i10 == 0) {
                return 3;
            }
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                int i13 = i10 - 2;
                if (i12 == 0) {
                    languageSelectActivity.manualTranslationPosition = i10;
                    return 2;
                }
                i12 = i13;
            } else {
                languageSelectActivity.manualTranslationPosition = -1;
            }
            if (!languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() || languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                languageSelectActivity.autoTranslationPosition = -1;
            } else {
                int i14 = i12 - 1;
                if (i12 == 0) {
                    languageSelectActivity.autoTranslationPosition = i10;
                    return 2;
                }
                i12 = i14;
            }
            if (languageSelectActivity.g0() || languageSelectActivity.h0()) {
                languageSelectActivity.doNotTranslatePosition = i10;
                int i15 = i12 - 1;
                if (i12 == 0) {
                    return 4;
                }
                i12 = i15;
            }
            i11 = i12 - 1;
            if (i12 == 0) {
                languageSelectActivity.n = i10;
                return 6;
            }
        } else {
            i11 = i10;
        }
        int i16 = i11 - 1;
        if (i11 == 0) {
            return 3;
        }
        if (!languageSelectActivity.h.isEmpty()) {
            if (i16 != languageSelectActivity.h.size()) {
            }
            return 1;
        }
        if (!languageSelectActivity.h.isEmpty() || i16 != languageSelectActivity.f.size()) {
            languageSelectActivity.r = i10 - i16;
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0294, code lost:
    
        if (r2 == (r11.e.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0296, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0298, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02bc, code lost:
    
        if (r2 == (r11.h.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02e7, code lost:
    
        if (r2 == (r11.f.size() - 1)) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
    
        if (r1.getValueTextView().getPaint().measureText(r4) > java.lang.Math.min((org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(34.0f)) / 2.0f, (org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(84.0f)) - r1.getTextView().getPaint().measureText(r3))) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        String sb2;
        int i13 = i10;
        int i14 = o1Var.f;
        View view = o1Var.a;
        boolean z11 = this.d;
        LocaleController.LocaleInfo localeInfo = null;
        r8 = null;
        CharSequence charSequence = null;
        localeInfo = null;
        localeInfo = null;
        localeInfo = null;
        boolean z12 = true;
        LanguageSelectActivity languageSelectActivity = this.e;
        switch (i14) {
            case 0:
                if (!z11) {
                    i13 -= languageSelectActivity.r;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.c();
                if (!z11) {
                    if (!languageSelectActivity.h.isEmpty() && i13 >= 0 && i13 < languageSelectActivity.h.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i13);
                        break;
                    } else {
                        if (!languageSelectActivity.h.isEmpty()) {
                            i13 = org.telegram.ui.Cells.pa.e(1, i13, languageSelectActivity.h);
                        }
                        if (i13 >= 0 && i13 < languageSelectActivity.f.size()) {
                            localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i13);
                        }
                        break;
                    }
                } else {
                    if (i13 >= 0 && i13 < languageSelectActivity.e.size()) {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i13);
                    }
                    break;
                }
                if (localeInfo != null) {
                    if (localeInfo.isLocal()) {
                        z8Var.b(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z10);
                    } else {
                        z8Var.b(localeInfo.name, localeInfo.nameEnglish, !z10);
                    }
                }
                z8Var.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                break;
            case 1:
                if (!z11) {
                    i13--;
                }
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                boolean isEmpty = languageSelectActivity.h.isEmpty();
                Context context = this.c;
                if (!isEmpty && i13 == languageSelectActivity.h.size()) {
                    w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                    break;
                } else {
                    w6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                View view2 = p8Var.e;
                TextView textView = p8Var.d;
                TextView textView2 = p8Var.c;
                boolean z13 = p8Var.D;
                boolean z14 = LocaleController.isRTL;
                if (z13 != z14) {
                    p8Var.D = z14;
                    textView2.setGravity((z14 ? 5 : 3) | 16);
                    p8Var.removeView(textView2);
                    boolean z15 = LocaleController.isRTL;
                    p8Var.addView(textView2, h7.z5.d(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : p8Var.A, 0.0f, z15 ? p8Var.A : 70.0f, 0.0f));
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    p8Var.removeView(textView);
                    boolean z16 = LocaleController.isRTL;
                    p8Var.addView(textView, h7.z5.d(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : p8Var.A, 36.0f, z16 ? p8Var.A : 64.0f, 0.0f));
                    p8Var.removeView(view2);
                    p8Var.addView(view2, h7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                }
                i11 = languageSelectActivity.manualTranslationPosition;
                if (i13 != i11) {
                    i12 = languageSelectActivity.autoTranslationPosition;
                    if (i13 == i12) {
                        CharSequence string = LocaleController.getString(R.string.ShowTranslateChatButton);
                        boolean g02 = languageSelectActivity.g0();
                        if (!languageSelectActivity.h0() && !languageSelectActivity.g0()) {
                            z12 = false;
                        }
                        p8Var.f(string, g02, z12);
                        p8Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                        break;
                    }
                } else {
                    p8Var.f(LocaleController.getString(R.string.ShowTranslateButton), languageSelectActivity.h0(), true);
                    p8Var.setCheckBoxIcon(0);
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Cells.j4) view).setText(LocaleController.getString((i13 == 0 && (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
                break;
            case 4:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                x9Var.d();
                HashSet Y = a31.Y();
                String string2 = LocaleController.getString(R.string.DoNotTranslate);
                try {
                    boolean[] zArr = new boolean[1];
                    if (Y.size() != 0) {
                        if (Y.size() != 1) {
                            Iterator it = Y.iterator();
                            StringBuilder sb3 = new StringBuilder();
                            boolean z17 = true;
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!z17) {
                                    sb3.append(", ");
                                }
                                String z18 = org.telegram.ui.Components.b31.z(org.telegram.ui.Components.b31.E(str, zArr, null));
                                if (z18 != null) {
                                    sb3.append(z18);
                                    z17 = false;
                                }
                            }
                            sb2 = sb3.toString();
                            try {
                                break;
                            } catch (Exception unused) {
                                break;
                            }
                        } else {
                            charSequence = org.telegram.ui.Components.b31.z(org.telegram.ui.Components.b31.E((String) Y.iterator().next(), zArr, null));
                        }
                    } else {
                        charSequence = "";
                    }
                } catch (Exception unused2) {
                }
                if (charSequence == null) {
                    charSequence = String.format(LocaleController.getPluralString("Languages", Y.size()), Integer.valueOf(Y.size()));
                }
                x9Var.c(string2, charSequence, true, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.x9) view).d();
                break;
            case 6:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                org.telegram.ui.Cells.w1 w1Var = x8Var.a;
                boolean z19 = x8Var.n;
                boolean z20 = LocaleController.isRTL;
                if (z19 != z20) {
                    x8Var.n = z20;
                    w1Var.setGravity(z20 ? 5 : 3);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
                    layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
                    w1Var.setLayoutParams(layoutParams);
                }
                if (i13 != languageSelectActivity.n) {
                    x8Var.setTopPadding(0);
                    x8Var.setBottomPadding(16);
                    break;
                } else {
                    x8Var.setText(LocaleController.getString(R.string.TranslateMessagesInfo1));
                    x8Var.setTopPadding(11);
                    x8Var.setBottomPadding(16);
                    break;
                }
        }
        return;
        charSequence = sb2;
        if (charSequence == null) {
        }
        x9Var.c(string2, charSequence, true, false);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 != 0) {
            view = i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? new org.telegram.ui.Cells.x9(context) : i10 != 6 ? new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null) : new org.telegram.ui.Cells.x8(context) : new org.telegram.ui.Cells.j4(context) : new org.telegram.ui.Cells.p8(context);
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.e = 50;
            z8Var.r = 21;
            TextView textView = new TextView(context);
            z8Var.a = textView;
            org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            z8Var.addView(textView, h7.z5.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
            TextView textView2 = new TextView(context);
            z8Var.b = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false));
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            z8Var.addView(textView2, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            z8Var.c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.h7, false));
            z8Var.addView(radioButton, h7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            z8Var.n = LocaleController.isRTL;
            z8Var.setClipChildren(false);
            view = z8Var;
        }
        return new org.telegram.ui.Components.lk0(view);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        View view = o1Var.a;
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).c();
        }
    }
}
