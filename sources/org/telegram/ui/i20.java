package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i20 extends pg.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public i20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        g20 g20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (g20Var = (g20) filtersSetupActivity.n.get(i10)) != null) {
                return g20Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bc  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        char c10;
        boolean z10;
        int i11;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        g20 g20Var = (g20) arrayList.get(i10);
        if (g20Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z11 = i12 < arrayList.size() && ((g20) arrayList.get(i12)).a != 3;
        boolean z12 = i12 >= arrayList.size();
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(g20Var.c);
            return;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(g20Var.c)) {
                    e9Var.setText(null);
                    e9Var.setFixedSize(12);
                } else {
                    e9Var.setFixedSize(0);
                    e9Var.setText(g20Var.c);
                }
                e9Var.setBottomPadding(z12 ? 32 : 17);
                return;
            }
            if (i13 != 4) {
                if (i13 != 5) {
                    if (i13 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.f(g20Var.c, filtersSetupActivity.getMessagesController().folderTags, z11);
                    w8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                j20 j20Var = (j20) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = g20Var.e;
                j20Var.d = z11;
                j20Var.e = tL_dialogFilterSuggested;
                j20Var.setWillNotDraw(!z11);
                j20Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                j20Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            k20 k20Var = (k20) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
            k20Var.a.l(((Object) g20Var.c) + "", false);
            k20Var.b.setImageDrawable(crVar);
            return;
        }
        e20 e20Var = (e20) view;
        MessagesController.DialogFilter dialogFilter = g20Var.d;
        ImageView imageView = e20Var.h;
        org.telegram.ui.ActionBar.h5 h5Var = e20Var.a;
        ImageView imageView2 = e20Var.c;
        View view2 = e20Var.f;
        FiltersSetupActivity filtersSetupActivity2 = e20Var.E;
        MessagesController.DialogFilter dialogFilter2 = e20Var.x;
        int i14 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        e20Var.x = dialogFilter;
        int i15 = dialogFilter == null ? -1 : dialogFilter.id;
        if (i14 != i15) {
            z10 = true;
            c10 = 1;
        } else {
            c10 = 1;
            z10 = false;
        }
        int i16 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i16 >= 0) {
            i11 = 0;
            if (dialogFilter.color != e20Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.g6.r8;
                e20Var.e = i16;
                view2.setBackground(org.telegram.ui.ActionBar.g6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i16 % iArr.length])));
            }
        } else {
            i11 = 0;
        }
        if (i16 != e20Var.d) {
            ValueAnimator valueAnimator = e20Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i14 == i15) {
                float alpha = imageView2.getAlpha();
                float f7 = i16 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i11] = alpha;
                fArr[c10] = f7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                e20Var.y = ofFloat;
                ofFloat.addUpdateListener(new e3(e20Var, 14));
                e20Var.y.setInterpolator(org.telegram.ui.Components.es.h);
                e20Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = e20Var.y;
                if (i16 >= 0) {
                    max = Math.max(i11, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(i11, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                e20Var.y.start();
            } else {
                imageView2.setScaleX(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i16 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i16 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i16 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i16 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i16 >= 0 ? 1.0f : 0.0f);
            }
            e20Var.d = i16;
        }
        e20Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i17 = dialogFilter.flags;
            int i18 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i17 & i18) != i18) {
                if ((i17 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterNonContacts));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterGroups));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterChannels));
                }
                if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.getString(R.string.FilterBots));
                }
                if (dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
                    if (sb2.length() != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
                }
                if (sb2.length() == 0) {
                    sb2.append(LocaleController.getString(R.string.FilterNoChats));
                }
                String str = dialogFilter.name;
                if (dialogFilter.isDefault()) {
                    str = LocaleController.getString(R.string.FilterAllChats);
                }
                if (!z10) {
                    e20Var.w = e20Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
                h5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                h5Var.l(replaceAnimatedEmoji, false);
                e20Var.b.setText(sb2);
                e20Var.v = z11;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                e20Var.invalidate();
            }
        }
        sb2.append(LocaleController.getString(R.string.FilterAllChats));
        if (dialogFilter.alwaysShow.isEmpty()) {
        }
        if (sb2.length() != 0) {
        }
        sb2.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
        if (sb2.length() == 0) {
        }
        String str2 = dialogFilter.name;
        if (dialogFilter.isDefault()) {
        }
        if (!z10) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
        h5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        h5Var.l(replaceAnimatedEmoji2, false);
        e20Var.b.setText(sb2);
        e20Var.v = z11;
        if (dialogFilter.isDefault()) {
        }
        e20Var.invalidate();
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 == 3) {
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                } else if (i10 == 4) {
                    k20 k20Var = new k20(context);
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    k20Var.a = h5Var;
                    h5Var.setTextSize(16);
                    h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.g6.o6;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
                    h5Var.setTag(Integer.valueOf(i12));
                    k20Var.addView(h5Var);
                    ImageView imageView = new ImageView(context);
                    k20Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    k20Var.addView(imageView);
                    frameLayout = k20Var;
                } else if (i10 != 6) {
                    j20 j20Var = new j20(context);
                    TextView textView = new TextView(context);
                    j20Var.a = textView;
                    org.telegram.messenger.yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    j20Var.addView(textView, w7.a6.a(-2.0f, 22.0f, 10.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                    TextView textView2 = new TextView(context);
                    j20Var.b = textView2;
                    org.telegram.messenger.yh.t(textView2, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    j20Var.addView(textView2, w7.a6.a(-2.0f, 22.0f, 35.0f, 22.0f, 0.0f, -2, LocaleController.isRTL ? 5 : 3));
                    org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(context);
                    j20Var.c = yi0Var;
                    yi0Var.setText(LocaleController.getString(R.string.Add));
                    yi0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    yi0Var.setProgressColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    yi0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, x02));
                    j20Var.addView(yi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    j20Var.setAddOnClickListener(new xv(i11, this, j20Var));
                    frameLayout = j20Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.w8(context);
                }
            } else {
                e20 e20Var = new e20(this.e, context);
                e20Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                e20Var.setOnReorderButtonTouchListener(new di.p1(i11, this, e20Var));
                e20Var.setOnOptionsClick(new a(this, 27));
                frameLayout = e20Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            f20 f20Var = new f20(context);
            org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
            f20Var.a = bk0Var;
            bk0Var.f(i13, 90, 90, null);
            bk0Var.setScaleType(ImageView.ScaleType.CENTER);
            bk0Var.d();
            bk0Var.setImportantForAccessibility(2);
            f20Var.addView(bk0Var, w7.a6.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
            bk0Var.setOnClickListener(new a(f20Var, 26));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            f20Var.addView(textView3, w7.a6.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
            frameLayout = f20Var;
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
