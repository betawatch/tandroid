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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f20 extends ng.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public f20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 5 || i10 == 1) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.n.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        d20 d20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (d20Var = (d20) filtersSetupActivity.n.get(i10)) != null) {
                return d20Var.a;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        char c10;
        long j3;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        d20 d20Var = (d20) arrayList.get(i10);
        if (d20Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((d20) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(d20Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (TextUtils.isEmpty(d20Var.c)) {
                    f9Var.setText(null);
                    f9Var.setFixedSize(12);
                } else {
                    f9Var.setFixedSize(0);
                    f9Var.setText(d20Var.c);
                }
                f9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    x8Var.f(d20Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    x8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                g20 g20Var = (g20) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = d20Var.e;
                g20Var.d = z10;
                g20Var.e = tL_dialogFilterSuggested;
                g20Var.setWillNotDraw(!z10);
                g20Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                g20Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            h20 h20Var = (h20) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
            h20Var.a.l(((Object) d20Var.c) + "", false);
            h20Var.b.setImageDrawable(vqVar);
            return;
        }
        b20 b20Var = (b20) view;
        MessagesController.DialogFilter dialogFilter = d20Var.d;
        ImageView imageView = b20Var.h;
        org.telegram.ui.ActionBar.l5 l5Var = b20Var.a;
        ImageView imageView2 = b20Var.c;
        View view2 = b20Var.f;
        FiltersSetupActivity filtersSetupActivity2 = b20Var.E;
        MessagesController.DialogFilter dialogFilter2 = b20Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        b20Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0) {
            c10 = 0;
            if (dialogFilter.color != b20Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.j6.r8;
                b20Var.e = i15;
                view2.setBackground(org.telegram.ui.ActionBar.j6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length])));
            }
        } else {
            c10 = 0;
        }
        if (i15 != b20Var.d) {
            ValueAnimator valueAnimator = b20Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i13 == i14) {
                float alpha = imageView2.getAlpha();
                float f7 = i15 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = alpha;
                fArr[1] = f7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                b20Var.y = ofFloat;
                ofFloat.addUpdateListener(new d3(b20Var, 14));
                b20Var.y.setInterpolator(org.telegram.ui.Components.wr.h);
                b20Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = b20Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                b20Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            b20Var.d = i15;
        }
        b20Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
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
                    b20Var.w = b20Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, l5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, l5Var.getPaint().getFontMetricsInt());
                l5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                l5Var.l(replaceAnimatedEmoji, false);
                b20Var.b.setText(sb2);
                b20Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                b20Var.invalidate();
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
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, l5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, l5Var.getPaint().getFontMetricsInt());
        l5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        l5Var.l(replaceAnimatedEmoji2, false);
        b20Var.b.setText(sb2);
        b20Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        b20Var.invalidate();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 1) {
            int i11 = 6;
            if (i10 != 2) {
                if (i10 == 3) {
                    frameLayout = new org.telegram.ui.Cells.f9(context);
                } else if (i10 == 4) {
                    h20 h20Var = new h20(context);
                    org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
                    h20Var.a = l5Var;
                    l5Var.setTextSize(16);
                    l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.j6.o6;
                    l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    l5Var.setTag(Integer.valueOf(i12));
                    h20Var.addView(l5Var);
                    ImageView imageView = new ImageView(context);
                    h20Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    h20Var.addView(imageView);
                    frameLayout = h20Var;
                } else if (i10 != 6) {
                    g20 g20Var = new g20(context);
                    TextView textView = new TextView(context);
                    g20Var.a = textView;
                    org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    g20Var.addView(textView, w7.a6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    g20Var.b = textView2;
                    org.telegram.messenger.em.r(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    g20Var.addView(textView2, w7.a6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.hi0 hi0Var = new org.telegram.ui.Components.hi0(context);
                    g20Var.c = hi0Var;
                    hi0Var.setText(LocaleController.getString(R.string.Add));
                    hi0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
                    hi0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                    org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                    hi0Var.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{14.0f}, w02));
                    g20Var.addView(hi0Var, w7.a6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    g20Var.setAddOnClickListener(new ow(r4, this, g20Var));
                    frameLayout = g20Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.x8(context);
                }
            } else {
                b20 b20Var = new b20(this.e, context);
                b20Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                b20Var.setOnReorderButtonTouchListener(new bi.x1(i11, this, b20Var));
                b20Var.setOnOptionsClick(new a(this, 28));
                frameLayout = b20Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            c20 c20Var = new c20(context);
            org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
            c20Var.a = kj0Var;
            kj0Var.f(i13, 90, 90, null);
            kj0Var.setScaleType(ImageView.ScaleType.CENTER);
            kj0Var.d();
            kj0Var.setImportantForAccessibility(2);
            c20Var.addView(kj0Var, w7.a6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            kj0Var.setOnClickListener(new a(c20Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            c20Var.addView(textView3, w7.a6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = c20Var;
        }
        return new org.telegram.ui.Components.fl0(frameLayout);
    }
}
