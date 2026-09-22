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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e20 extends og.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public e20(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.kl0
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
        b20 b20Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 < filtersSetupActivity.n.size() && (b20Var = (b20) filtersSetupActivity.n.get(i10)) != null) {
                return b20Var.a;
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
        b20 b20Var = (b20) arrayList.get(i10);
        if (b20Var == null) {
            return;
        }
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((b20) arrayList.get(i11)).a != 3;
        boolean z11 = i11 >= arrayList.size();
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(b20Var.c);
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (TextUtils.isEmpty(b20Var.c)) {
                    e9Var.setText(null);
                    e9Var.setFixedSize(12);
                } else {
                    e9Var.setFixedSize(0);
                    e9Var.setText(b20Var.c);
                }
                e9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    if (i12 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    w8Var.f(b20Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    w8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                f20 f20Var = (f20) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = b20Var.e;
                f20Var.d = z10;
                f20Var.e = tL_dialogFilterSuggested;
                f20Var.setWillNotDraw(!z10);
                f20Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                f20Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            g20 g20Var = (g20) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.k7, false), mode));
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
            g20Var.a.l(((Object) b20Var.c) + "", false);
            g20Var.b.setImageDrawable(pqVar);
            return;
        }
        z10 z10Var = (z10) view;
        MessagesController.DialogFilter dialogFilter = b20Var.d;
        ImageView imageView = z10Var.h;
        org.telegram.ui.ActionBar.j5 j5Var = z10Var.a;
        ImageView imageView2 = z10Var.c;
        View view2 = z10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = z10Var.E;
        MessagesController.DialogFilter dialogFilter2 = z10Var.x;
        int i13 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        z10Var.x = dialogFilter;
        int i14 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i13 != i14;
        int i15 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i15 >= 0) {
            c10 = 0;
            if (dialogFilter.color != z10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.i6.r8;
                z10Var.e = i15;
                view2.setBackground(org.telegram.ui.ActionBar.i6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i15 % iArr.length])));
            }
        } else {
            c10 = 0;
        }
        if (i15 != z10Var.d) {
            ValueAnimator valueAnimator = z10Var.y;
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
                z10Var.y = ofFloat;
                ofFloat.addUpdateListener(new b3(z10Var, 14));
                z10Var.y.setInterpolator(org.telegram.ui.Components.qr.h);
                z10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = z10Var.y;
                if (i15 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i10);
                    j3 = 27;
                } else {
                    j3 = 27;
                    max = Math.max(0, i10 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j3);
                z10Var.y.start();
            } else {
                imageView2.setScaleX(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i15 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i15 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i15 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i15 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i15 >= 0 ? 1.0f : 0.0f);
            }
            z10Var.d = i15;
        }
        z10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
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
                    z10Var.w = z10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
                j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                j5Var.l(replaceAnimatedEmoji, false);
                z10Var.b.setText(sb2);
                z10Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                z10Var.invalidate();
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
        Spannable replaceAnimatedEmoji2 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str2, j5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, j5Var.getPaint().getFontMetricsInt());
        j5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
        j5Var.l(replaceAnimatedEmoji2, false);
        z10Var.b.setText(sb2);
        z10Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        z10Var.invalidate();
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
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                } else if (i10 == 4) {
                    g20 g20Var = new g20(context);
                    org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                    g20Var.a = j5Var;
                    j5Var.setTextSize(16);
                    j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i12 = org.telegram.ui.ActionBar.i6.o6;
                    j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    j5Var.setTag(Integer.valueOf(i12));
                    g20Var.addView(j5Var);
                    ImageView imageView = new ImageView(context);
                    g20Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g20Var.addView(imageView);
                    frameLayout = g20Var;
                } else if (i10 != 6) {
                    f20 f20Var = new f20(context);
                    TextView textView = new TextView(context);
                    f20Var.a = textView;
                    org.telegram.messenger.vl.s(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    f20Var.addView(textView, w7.x5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    f20Var.b = textView2;
                    org.telegram.messenger.vl.s(textView2, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    f20Var.addView(textView2, w7.x5.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(context);
                    f20Var.c = xh0Var;
                    xh0Var.setText(LocaleController.getString(R.string.Add));
                    xh0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    xh0Var.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                    org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                    xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{14.0f}, w02));
                    f20Var.addView(xh0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    f20Var.setAddOnClickListener(new sv(i11, this, f20Var));
                    frameLayout = f20Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.w8(context);
                }
            } else {
                z10 z10Var = new z10(this.e, context);
                z10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                z10Var.setOnReorderButtonTouchListener(new ci.q1(i11, this, z10Var));
                z10Var.setOnOptionsClick(new a(this, 28));
                frameLayout = z10Var;
            }
        } else {
            int i13 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            a20 a20Var = new a20(context);
            org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
            a20Var.a = aj0Var;
            aj0Var.f(i13, 90, 90, null);
            aj0Var.setScaleType(ImageView.ScaleType.CENTER);
            aj0Var.d();
            aj0Var.setImportantForAccessibility(2);
            a20Var.addView(aj0Var, w7.x5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            aj0Var.setOnClickListener(new a(a20Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            a20Var.addView(textView3, w7.x5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = a20Var;
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
