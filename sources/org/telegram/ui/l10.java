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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l10 extends wf.b {
    public final Context d;
    public final /* synthetic */ FiltersSetupActivity e;

    public l10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 3 || i9 == 0 || i9 == 5 || i9 == 1) ? false : true;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.n.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        j10 j10Var;
        if (i9 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i9 < filtersSetupActivity.n.size() && (j10Var = (j10) filtersSetupActivity.n.get(i9)) != null) {
                return j10Var.a;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        char c10;
        long j10;
        int max;
        FiltersSetupActivity filtersSetupActivity = this.e;
        ArrayList arrayList = filtersSetupActivity.n;
        j10 j10Var = (j10) arrayList.get(i9);
        if (j10Var == null) {
            return;
        }
        int i10 = i9 + 1;
        boolean z10 = i10 < arrayList.size() && ((j10) arrayList.get(i10)).a != 3;
        boolean z11 = i10 >= arrayList.size();
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(j10Var.c);
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (TextUtils.isEmpty(j10Var.c)) {
                    b9Var.setText(null);
                    b9Var.setFixedSize(12);
                } else {
                    b9Var.setFixedSize(0);
                    b9Var.setText(j10Var.c);
                }
                b9Var.setBottomPadding(z11 ? 32 : 17);
                return;
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    t8Var.f(j10Var.c, filtersSetupActivity.getMessagesController().folderTags, z10);
                    t8Var.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    return;
                }
                m10 m10Var = (m10) view;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = j10Var.e;
                m10Var.d = z10;
                m10Var.e = tL_dialogFilterSuggested;
                m10Var.setWillNotDraw(!z10);
                m10Var.a.setText(tL_dialogFilterSuggested.filter.title.text);
                m10Var.b.setText(tL_dialogFilterSuggested.description);
                return;
            }
            n10 n10Var = (n10) view;
            Context context = this.d;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
            n10Var.a.l(((Object) j10Var.c) + "", false);
            n10Var.b.setImageDrawable(fqVar);
            return;
        }
        h10 h10Var = (h10) view;
        MessagesController.DialogFilter dialogFilter = j10Var.d;
        ImageView imageView = h10Var.h;
        org.telegram.ui.ActionBar.h5 h5Var = h10Var.a;
        ImageView imageView2 = h10Var.c;
        View view2 = h10Var.f;
        FiltersSetupActivity filtersSetupActivity2 = h10Var.A;
        MessagesController.DialogFilter dialogFilter2 = h10Var.x;
        int i12 = dialogFilter2 == null ? -1 : dialogFilter2.id;
        h10Var.x = dialogFilter;
        int i13 = dialogFilter == null ? -1 : dialogFilter.id;
        boolean z12 = i12 != i13;
        int i14 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
        if (i14 >= 0) {
            c10 = 0;
            if (dialogFilter.color != h10Var.e) {
                int dp = AndroidUtilities.dp(22.0f);
                int[] iArr = org.telegram.ui.ActionBar.f6.r8;
                h10Var.e = i14;
                view2.setBackground(org.telegram.ui.ActionBar.f6.K(dp, filtersSetupActivity2.getThemedColor(iArr[i14 % iArr.length])));
            }
        } else {
            c10 = 0;
        }
        if (i14 != h10Var.d) {
            ValueAnimator valueAnimator = h10Var.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i12 == i13) {
                float alpha = imageView2.getAlpha();
                float f10 = i14 >= 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = alpha;
                fArr[1] = f10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                h10Var.y = ofFloat;
                ofFloat.addUpdateListener(new f3(h10Var, 14));
                h10Var.y.setInterpolator(org.telegram.ui.Components.gr.h);
                h10Var.y.setDuration(340L);
                ValueAnimator valueAnimator2 = h10Var.y;
                if (i14 >= 0) {
                    max = Math.max(0, filtersSetupActivity2.v - i9);
                    j10 = 27;
                } else {
                    j10 = 27;
                    max = Math.max(0, i9 - filtersSetupActivity2.s);
                }
                valueAnimator2.setStartDelay(max * j10);
                h10Var.y.start();
            } else {
                imageView2.setScaleX(i14 >= 0 ? 0.5f : 1.0f);
                imageView2.setScaleY(i14 >= 0 ? 0.5f : 1.0f);
                imageView2.setAlpha(i14 >= 0 ? 0.0f : 1.0f);
                view2.setScaleX(i14 >= 0 ? 1.0f : 0.5f);
                view2.setScaleY(i14 >= 0 ? 1.0f : 0.5f);
                view2.setAlpha(i14 >= 0 ? 1.0f : 0.0f);
            }
            h10Var.d = i14;
        }
        h10Var.n.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
        StringBuilder sb2 = new StringBuilder();
        if (!dialogFilter.isDefault()) {
            int i15 = dialogFilter.flags;
            int i16 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
            if ((i15 & i16) != i16) {
                if ((i15 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
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
                    h10Var.w = h10Var.x.locked ? 1.0f : 0.0f;
                }
                Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(str, h5Var.getPaint().getFontMetricsInt(), false), dialogFilter.entities, h5Var.getPaint().getFontMetricsInt());
                h5Var.setEmojiCacheType(!dialogFilter.title_noanimate ? 26 : 0);
                h5Var.l(replaceAnimatedEmoji, false);
                h10Var.b.setText(sb2);
                h10Var.v = z10;
                if (dialogFilter.isDefault()) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                h10Var.invalidate();
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
        h10Var.b.setText(sb2);
        h10Var.v = z10;
        if (dialogFilter.isDefault()) {
        }
        h10Var.invalidate();
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        Context context = this.d;
        if (i9 == 0) {
            frameLayout = new org.telegram.ui.Cells.m4(context);
        } else if (i9 != 1) {
            int i10 = 6;
            if (i9 != 2) {
                if (i9 == 3) {
                    frameLayout = new org.telegram.ui.Cells.b9(context);
                } else if (i9 == 4) {
                    n10 n10Var = new n10(context);
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    n10Var.a = h5Var;
                    h5Var.setTextSize(16);
                    h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
                    int i11 = org.telegram.ui.ActionBar.f6.o6;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    h5Var.setTag(Integer.valueOf(i11));
                    n10Var.addView(h5Var);
                    ImageView imageView = new ImageView(context);
                    n10Var.b = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    n10Var.addView(imageView);
                    frameLayout = n10Var;
                } else if (i9 != 6) {
                    m10 m10Var = new m10(context);
                    TextView textView = new TextView(context);
                    m10Var.a = textView;
                    org.telegram.messenger.ll.s(textView, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                    m10Var.addView(textView, g7.e6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    m10Var.b = textView2;
                    org.telegram.messenger.ll.s(textView2, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), 1, 13.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                    m10Var.addView(textView2, g7.e6.d(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
                    org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(context);
                    m10Var.c = jh0Var;
                    jh0Var.setText(LocaleController.getString(R.string.Add));
                    jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                    jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oh, false);
                    org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
                    jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{14.0f}, w02));
                    m10Var.addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                    m10Var.setAddOnClickListener(new org.telegram.ui.Components.vh0(23, this, m10Var));
                    frameLayout = m10Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.t8(context);
                }
            } else {
                h10 h10Var = new h10(this.e, context);
                h10Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                h10Var.setOnReorderButtonTouchListener(new kh.r1(i10, this, h10Var));
                h10Var.setOnOptionsClick(new a(this, 28));
                frameLayout = h10Var;
            }
        } else {
            int i12 = R.raw.filters;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
            i10 i10Var = new i10(context);
            org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
            i10Var.a = pi0Var;
            pi0Var.f(i12, 90, 90, null);
            pi0Var.setScaleType(ImageView.ScaleType.CENTER);
            pi0Var.d();
            pi0Var.setImportantForAccessibility(2);
            i10Var.addView(pi0Var, g7.e6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            pi0Var.setOnClickListener(new a(i10Var, 27));
            TextView textView3 = new TextView(context);
            textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(replaceTags);
            i10Var.addView(textView3, g7.e6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            frameLayout = i10Var;
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
