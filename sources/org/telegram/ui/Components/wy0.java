package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wy0 extends TableLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public wy0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = b6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final uy0 a(CharSequence charSequence) {
        dh.u uVar = new dh.u(getContext());
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        uVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        uVar.setTextSize(1, 14.0f);
        uVar.setText(Emoji.replaceEmoji(charSequence, uVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(uVar);
        uVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        uy0 uy0Var = new uy0(this, uVar, true);
        tableRow.addView(uy0Var, layoutParams);
        addView(tableRow);
        return uy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        s5 s5Var = new s5(getContext());
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.a));
        s5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        s5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false), arrayList, s5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(s5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new uy0(this, s5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, vy0[] vy0VarArr, qc[] qcVarArr) {
        qc qcVar = new qc(getContext(), null);
        qcVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.a));
        qcVar.setTextSize(1, 14.0f);
        qcVar.setText(Emoji.replaceEmoji(charSequence2, qcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(qcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        vy0 vy0Var = new vy0(this, charSequence);
        if (vy0VarArr != null) {
            vy0VarArr[0] = vy0Var;
        }
        tableRow.addView(vy0Var, layoutParams);
        tableRow.addView(new ty0(this, qcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (qcVarArr != null) {
            qcVarArr[0] = qcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        qc qcVar = new qc(getContext(), null);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        qcVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        qcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, qcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b(str2, runnable, b6Var, num));
        }
        qcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(qcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new vy0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ty0(this, qcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i9, String str) {
        long j10 = i9 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        l80 l80Var = new l80(context, b6Var);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i9 = org.telegram.ui.ActionBar.f6.gc;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(true);
        l80Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new lc(3, runnable), 0, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        i(l80Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i9, e5.u uVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        textView.setTextSize(1, i9);
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.f6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new vh0(3, charSequence, uVar));
        g7.g6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 7, -1));
        frameLayout.addView(imageView, g7.e6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new vy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ty0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i9, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        qc qcVar = new qc(context, b6Var);
        qcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        qcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.f6.gc;
        qcVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        qcVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        qcVar.setTextSize(1, 14.0f);
        qcVar.setSingleLine(true);
        qcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(qcVar, 24.0f, i9);
        ImageReceiver imageReceiver = f5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fq a2 = gh.ja.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fq a3 = gh.ja.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a3.e = dp3;
                a3.f = dp4;
                imageReceiver.setImageBitmap(a3);
                z10 = false;
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                    z10 = user == null;
                    str2 = UserObject.getUserName(user);
                    f5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                    z10 = chat == null;
                    str2 = chat == null ? "" : chat.title;
                    f5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new lc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            qcVar.I = new rc(str, runnable2, b6Var);
        }
        qcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(qcVar, charSequence);
    }

    public final void k(String str, int i9, long j10, Runnable runnable) {
        j(str, i9, j10, runnable, null, null);
    }

    public final TableRow l(String str, final int i9, final long j10, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        final j80 j80Var = new j80(context, b6Var);
        j80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        j80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        j80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        j80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(j80Var, 24.0f, i9);
        ImageReceiver imageReceiver = f5Var.b;
        if (j10 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            fq a2 = gh.ja.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fq a3 = gh.ja.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a3.e = dp3;
                a3.f = dp4;
                imageReceiver.setImageBitmap(a3);
            } else if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                str2 = UserObject.getUserName(user);
                f5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                str2 = chat == null ? "" : chat.title;
                f5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            j80Var.setClickable(true);
            spannableStringBuilder.setSpan(new lc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        final i5 i5Var = new i5(AndroidUtilities.dp(20.0f), j80Var);
        i5Var.k(Integer.valueOf(v02));
        i5Var.E = AndroidUtilities.dp(12.0f);
        i5Var.F = 0;
        j80Var.addOnAttachStateChangeListener(new af.b(i5Var, 14));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.sy0
            /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
            @Override // org.telegram.messenger.Utilities.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run(Object obj) {
                TLRPC.EmojiStatus emojiStatus;
                boolean z11;
                long emojiStatusDocumentId;
                long j11 = j10;
                if (j11 == UserObject.ANONYMOUS || UserObject.isService(j11)) {
                    return;
                }
                int i11 = i9;
                if (j11 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j11));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z11 = true;
                        emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                        i5 i5Var2 = i5Var;
                        j80 j80Var2 = j80Var;
                        if (emojiStatusDocumentId == 0) {
                            i5Var2.j(emojiStatusDocumentId, true);
                            i5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            j80Var2.i(i5Var2);
                        } else if (z11) {
                            i5Var2.g(mutate, true);
                            i5Var2.m(false, true);
                            j80Var2.i(i5Var2);
                        } else {
                            j80Var2.i(null);
                        }
                        i5Var2.k(Integer.valueOf(v02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j11));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                i5 i5Var22 = i5Var;
                j80 j80Var22 = j80Var;
                if (emojiStatusDocumentId == 0) {
                }
                i5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        j80Var.i(i5Var);
        NotificationCenter.getInstance(i9).listen(j80Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i9).listen(j80Var, NotificationCenter.userEmojiStatusUpdated, callback);
        j80Var.l(spannableStringBuilder, false);
        return i(j80Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        l80 l80Var = new l80(getContext(), null);
        l80Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        l80Var.setTextSize(1, 13.0f);
        int i9 = org.telegram.ui.ActionBar.f6.j5;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, b6Var));
        l80Var.setMaxLines(1);
        l80Var.setSingleLine();
        l80Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        l80Var.setDisablePaddingsOffsetY(true);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(l80Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        super.onLayout(z10, i9, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        int i13 = org.telegram.ui.ActionBar.f6.qh;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ph, b6Var));
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt = tableRow.getChildAt(i15);
                    if (childAt instanceof vy0) {
                        vy0 vy0Var = (vy0) childAt;
                        boolean z12 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (vy0Var.b != z12 || vy0Var.c != z11) {
                            vy0Var.b = z12;
                            vy0Var.c = z11;
                            vy0Var.invalidate();
                        }
                    } else if (childAt instanceof ty0) {
                        ty0 ty0Var = (ty0) childAt;
                        boolean z13 = i14 == 0;
                        boolean z14 = i14 == childCount + (-1);
                        if (ty0Var.b != z13 || ty0Var.c != z14) {
                            ty0Var.b = z13;
                            ty0Var.c = z14;
                            ty0Var.invalidate();
                        }
                        boolean z15 = i15 == 0;
                        z11 = i15 == childCount2 + (-1);
                        if (ty0Var.d != z15 || ty0Var.e != z11) {
                            ty0Var.d = z15;
                            ty0Var.e = z11;
                            ty0Var.invalidate();
                        }
                    } else if (childAt instanceof uy0) {
                        uy0 uy0Var = (uy0) childAt;
                        boolean z16 = i14 == 0;
                        z11 = i14 == childCount + (-1);
                        if (uy0Var.c != z16 || uy0Var.d != z11) {
                            uy0Var.c = z16;
                            uy0Var.d = z11;
                            uy0Var.invalidate();
                        }
                    }
                    i15++;
                }
            }
            i14++;
        }
    }
}
