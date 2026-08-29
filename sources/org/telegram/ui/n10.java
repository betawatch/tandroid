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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n10 extends zf.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public n10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.n.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        l10 l10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (l10Var = (l10) filtersSetupActivity.n.get(i10)) != null) {
                return l10Var.a;
            }
            return 3;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c4  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        char c3;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        l10 l10Var = (l10) arrayList.get(i10);
        if (l10Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((l10) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.k4) view).setText(l10Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (TextUtils.isEmpty(l10Var.c)) {
                    y8Var.setText(null);
                    y8Var.setFixedSize(12);
                } else {
                    y8Var.setFixedSize(0);
                    y8Var.setText(l10Var.c);
                }
                y8Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    q8Var.f(l10Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    q8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                o10 o10Var = (o10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = l10Var.e;
                o10Var.d = z10;
                o10Var.e = tL_dialogFilterSuggested;
                o10Var.setWillNotDraw(!z10);
                o10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                o10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            p10 p10Var = (p10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(drawable, drawable2);
            p10Var.a.l(((Object) l10Var.c) + "", false);
            p10Var.b.setImageDrawable(jqVar);
            return;
        }
        j10 j10Var = (j10) view;
        MessagesController.DialogFilter dialogFilter = l10Var.d;
        ImageView imageView = j10Var.h;
        org.telegram.ui.ActionBar.h5 h5Var = j10Var.a;
        ImageView imageView2 = j10Var.c;
        View view2 = j10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = j10Var.A;
        MessagesController.DialogFilter dialogFilter2 = j10Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        j10Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0) {
            c3 = 0;
            if (dialogFilter.color != j10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.g6.r8;
                j10Var.e = i15;
                view2.setBackground(org.telegram.ui.ActionBar.g6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length])));
            }
        } else {
            c3 = 0;
        }
        if (i15 != j10Var.d) {
            ValueAnimator valueAnimator = j10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                float alpha = imageView2.getAlpha();
                float f9 = i15 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c3] = alpha;
                fArr[1] = f9;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                j10Var.y = ofFloat;
                ofFloat.addUpdateListener(new g3(j10Var, 14));
                j10Var.y.setInterpolator(org.telegram.ui.Components.jr.h);
                j10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = j10Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                j10Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            j10Var.d = i15;
        }
        j10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i16 = dialogFilter.flags;
            int i17 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i16 & i17) != i17) {
                if ((i16 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
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
                if (!z12) {
                    j10Var.w = j10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
                h5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                h5Var.l(replaceAnimatedEmoji, false);
                j10Var.b.setText(sb2);
                j10Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                j10Var.invalidate();
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
        if (!z12) {
        }
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
        h5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        h5Var.l(replaceAnimatedEmoji2, false);
        j10Var.b.setText(sb2);
        j10Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        j10Var.invalidate();
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.k4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 == 3) {
                    frameLayout = new org.telegram.ui.Cells.y8(context);
                } else if (i10 == 4) {
                    p10 p10Var = new p10(context);
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    p10Var.a = h5Var;
                    h5Var.setTextSize(16);
                    h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.g6.o6;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    h5Var.setTag(Integer.valueOf(i12));
                    p10Var.addView(h5Var);
                    ImageView imageView = new ImageView(context);
                    p10Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    p10Var.addView(imageView);
                    frameLayout = p10Var;
                } else if (i10 != 6) {
                    o10 o10Var = new o10(context);
                    TextView textView = new TextView(context);
                    o10Var.a = textView;
                    b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    o10Var.addView(textView, i7.f6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    o10Var.b = textView2;
                    b.r(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    o10Var.addView(textView2, i7.f6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.th0 th0Var = new org.telegram.ui.Components.th0(context);
                    o10Var.c = th0Var;
                    th0Var.setText(LocaleController.getString(R.string.Add));
                    th0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
                    th0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
                    org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
                    th0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{14.0f}, w02));
                    o10Var.addView(th0Var, i7.f6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    o10Var.setAddOnClickListener(new org.telegram.ui.Components.fi0(24, this, o10Var));
                    frameLayout = o10Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.q8(context);
                }
            } else {
                j10 j10Var = new j10(this.e, context);
                j10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                j10Var.setOnReorderButtonTouchListener(new nh.o1(i11, this, j10Var));
                j10Var.setOnOptionsClick(new a(this, 28));
                frameLayout = j10Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            k10 k10Var = new k10(context);
            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
            k10Var.a = aj0Var;
            aj0Var.f(i13, 90, 90, null);
            aj0Var.setScaleType(ImageView.ScaleType.CENTER);
            aj0Var.d();
            aj0Var.setImportantForAccessibility(2);
            k10Var.addView(aj0Var, i7.f6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            aj0Var.setOnClickListener(new a(k10Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            k10Var.addView(textView3, i7.f6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = k10Var;
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
