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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i80 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ LanguageSelectActivity e;

    public i80(LanguageSelectActivity languageSelectActivity, Context context, boolean z10) {
        this.e = languageSelectActivity;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 4 || i10 == 5 || i10 == 2;
    }

    @Override // s4.h0
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
            if (languageSelectActivity.h0() || languageSelectActivity.i0()) {
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
    @Override // s4.h0
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
            if (languageSelectActivity.h0() || languageSelectActivity.i0()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0263, code lost:
    
        if (r2 == (r8.e.size() - 1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0265, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0267, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x028b, code lost:
    
        if (r2 == (r8.h.size() - 1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02b6, code lost:
    
        if (r2 == (r8.f.size() - 1)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if (r1.getValueTextView().getPaint().measureText(r4) > java.lang.Math.min((org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(34.0f)) / 2.0f, (org.telegram.messenger.AndroidUtilities.displaySize.x - org.telegram.messenger.AndroidUtilities.dp(84.0f)) - r1.getTextView().getPaint().measureText(r3))) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        String sb2;
        int i13 = i10;
        int i14 = e1Var.f;
        View view = e1Var.a;
        LocaleController.LocaleInfo localeInfo = null;
        r5 = null;
        CharSequence charSequence = null;
        localeInfo = null;
        localeInfo = null;
        localeInfo = null;
        boolean z11 = true;
        LanguageSelectActivity languageSelectActivity = this.e;
        if (i14 == 0) {
            boolean z12 = this.d;
            if (!z12) {
                i13 -= languageSelectActivity.r;
            }
            org.telegram.ui.Cells.k9 k9Var = (org.telegram.ui.Cells.k9) view;
            k9Var.c();
            if (z12) {
                if (i13 >= 0 && i13 < languageSelectActivity.e.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.e.get(i13);
                }
            } else if (languageSelectActivity.h.isEmpty() || i13 < 0 || i13 >= languageSelectActivity.h.size()) {
                if (!languageSelectActivity.h.isEmpty()) {
                    i13 = ic.a.f(1, i13, languageSelectActivity.h);
                }
                if (i13 >= 0 && i13 < languageSelectActivity.f.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.f.get(i13);
                }
            } else {
                localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.h.get(i13);
            }
            if (localeInfo != null) {
                if (localeInfo.isLocal()) {
                    k9Var.b(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z10);
                } else {
                    k9Var.b(localeInfo.name, localeInfo.nameEnglish, !z10);
                }
            }
            k9Var.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
            return;
        }
        if (i14 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            View view2 = a9Var.e;
            TextView textView = a9Var.d;
            TextView textView2 = a9Var.c;
            boolean z13 = a9Var.H;
            boolean z14 = LocaleController.isRTL;
            if (z13 != z14) {
                a9Var.H = z14;
                textView2.setGravity((z14 ? 5 : 3) | 16);
                a9Var.removeView(textView2);
                boolean z15 = LocaleController.isRTL;
                a9Var.addView(textView2, org.telegram.ui.Components.kb1.h(-1, -1.0f, (z15 ? 5 : 3) | 48, z15 ? 70.0f : a9Var.E, 0.0f, z15 ? a9Var.E : 70.0f, 0.0f));
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                a9Var.removeView(textView);
                boolean z16 = LocaleController.isRTL;
                a9Var.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z16 ? 5 : 3) | 48, z16 ? 64.0f : a9Var.E, 36.0f, z16 ? a9Var.E : 64.0f, 0.0f));
                a9Var.removeView(view2);
                a9Var.addView(view2, org.telegram.ui.Components.kb1.h(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            }
            i11 = languageSelectActivity.manualTranslationPosition;
            if (i13 == i11) {
                a9Var.f(LocaleController.getString(R.string.ShowTranslateButton), languageSelectActivity.i0(), true);
                a9Var.setCheckBoxIcon(0);
                return;
            }
            i12 = languageSelectActivity.autoTranslationPosition;
            if (i13 == i12) {
                CharSequence string = LocaleController.getString(R.string.ShowTranslateChatButton);
                boolean h02 = languageSelectActivity.h0();
                if (!languageSelectActivity.i0() && !languageSelectActivity.h0()) {
                    z11 = false;
                }
                a9Var.f(string, h02, z11);
                a9Var.setCheckBoxIcon(languageSelectActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                return;
            }
            return;
        }
        if (i14 == 3) {
            ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString((i13 == 0 && (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
            return;
        }
        if (i14 != 4) {
            if (i14 == 5) {
                ((org.telegram.ui.Cells.ga) view).d();
                return;
            }
            if (i14 != 6) {
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            org.telegram.ui.Cells.w1 w1Var = i9Var.a;
            boolean z17 = i9Var.n;
            boolean z18 = LocaleController.isRTL;
            if (z17 != z18) {
                i9Var.n = z18;
                w1Var.setGravity(z18 ? 5 : 3);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w1Var.getLayoutParams();
                layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
                w1Var.setLayoutParams(layoutParams);
            }
            if (i13 != languageSelectActivity.n) {
                i9Var.setTopPadding(0);
                i9Var.setBottomPadding(16);
                return;
            } else {
                i9Var.setText(LocaleController.getString(R.string.TranslateMessagesInfo1));
                i9Var.setTopPadding(11);
                i9Var.setBottomPadding(16);
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        gaVar.d();
        HashSet Z = a31.Z();
        String string2 = LocaleController.getString(R.string.DoNotTranslate);
        try {
            boolean[] zArr = new boolean[1];
            if (Z.size() == 0) {
                charSequence = "";
            } else if (Z.size() == 1) {
                charSequence = org.telegram.ui.Components.g51.J(org.telegram.ui.Components.g51.N((String) Z.iterator().next(), zArr, null));
            } else {
                Iterator it = Z.iterator();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr = true;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (objArr == false) {
                        sb3.append(", ");
                    }
                    String J = org.telegram.ui.Components.g51.J(org.telegram.ui.Components.g51.N(str, zArr, null));
                    if (J != null) {
                        sb3.append(J);
                        objArr = false;
                    }
                }
                sb2 = sb3.toString();
            }
        } catch (Exception unused) {
        }
        if (charSequence == null) {
            charSequence = String.format(LocaleController.getPluralString("Languages", Z.size()), Integer.valueOf(Z.size()));
        }
        gaVar.c(string2, charSequence, true, false);
        charSequence = sb2;
        if (charSequence == null) {
        }
        gaVar.c(string2, charSequence, true, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 != 0) {
            view = i10 != 2 ? i10 != 3 ? (i10 == 4 || i10 == 5) ? new org.telegram.ui.Cells.ga(context) : i10 != 6 ? new org.telegram.ui.Cells.f7(context, (d3) null) : new org.telegram.ui.Cells.i9(context) : new org.telegram.ui.Cells.q4(context) : new org.telegram.ui.Cells.a9(context);
        } else {
            org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9(context);
            k9Var.e = 50;
            k9Var.r = 21;
            TextView textView = new TextView(context);
            k9Var.a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
            org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            boolean z10 = LocaleController.isRTL;
            k9Var.addView(textView, org.telegram.ui.Components.kb1.h(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 64.0f, 0.0f, z10 ? 64.0f : 21, 0.0f));
            TextView textView2 = new TextView(context);
            k9Var.b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.z6, null);
            textView2.setTextSize(1, 13.0f);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setPadding(0, 0, 0, 0);
            textView2.setEllipsize(truncateAt);
            boolean z11 = LocaleController.isRTL;
            k9Var.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 64.0f, 36.0f, z11 ? 64.0f : 21, 0.0f));
            RadioButton radioButton = new RadioButton(context);
            k9Var.c = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.h7, null);
            k9Var.addView(radioButton, org.telegram.ui.Components.kb1.h(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            k9Var.n = LocaleController.isRTL;
            k9Var.setClipChildren(false);
            view = k9Var;
        }
        return new org.telegram.ui.Components.wl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.k9) {
            ((org.telegram.ui.Cells.k9) view).c();
        }
    }
}
