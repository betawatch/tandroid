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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final Path b;
    public final float[] c;
    public final Paint d;
    public final Paint e;
    public final float f;
    public final float h;

    public pz0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.b = new Path();
        this.c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f = max;
        this.h = max / 2.0f;
        this.a = e6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final nz0 a(CharSequence charSequence) {
        vh.o oVar = new vh.o(getContext());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        oVar.setTextSize(1, 14.0f);
        oVar.setText(Emoji.replaceEmoji(charSequence, oVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        nz0 nz0Var = new nz0(this, oVar, true);
        tableRow.addView(nz0Var, layoutParams);
        addView(tableRow);
        return nz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        w5 w5Var = new w5(getContext());
        w5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.a));
        w5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        w5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false), arrayList, w5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(w5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new nz0(this, w5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, oz0[] oz0VarArr, xc[] xcVarArr) {
        xc xcVar = new xc(getContext(), null);
        xcVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.a));
        xcVar.setTextSize(1, 14.0f);
        xcVar.setText(Emoji.replaceEmoji(charSequence2, xcVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(xcVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        oz0 oz0Var = new oz0(this, charSequence);
        if (oz0VarArr != null) {
            oz0VarArr[0] = oz0Var;
        }
        tableRow.addView(oz0Var, layoutParams);
        tableRow.addView(new mz0(this, xcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (xcVarArr != null) {
            xcVarArr[0] = xcVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        xc xcVar = new xc(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        xcVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        xcVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, xcVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(str2, runnable, e6Var, num));
        }
        xcVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(xcVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new oz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new mz0(this, xcVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        c90 c90Var = new c90(context, e6Var);
        c90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setSingleLine(true);
        c90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new sc(3, runnable), 0, spannableStringBuilder.length(), 33);
        c90Var.setText(spannableStringBuilder);
        i(c90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, uh.i iVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.i6.v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new dt(16, charSequence, iVar));
        w7.z5.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, e6Var)), 7, -1));
        frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new oz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new mz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        xc xcVar = new xc(context, e6Var);
        xcVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        xcVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        xcVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        xcVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        xcVar.setTextSize(1, 14.0f);
        xcVar.setSingleLine(true);
        xcVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(xcVar, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = yh.r7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = yh.r7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
                z10 = false;
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    z10 = user == null;
                    str2 = UserObject.getUserName(user);
                    g5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    z10 = chat == null;
                    str2 = chat == null ? "" : chat.title;
                    g5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new sc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            xcVar.M = new yc(str, runnable2, e6Var);
        }
        xcVar.setText(spannableStringBuilder);
        if (z10) {
            return null;
        }
        return i(xcVar, charSequence);
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        final a90 a90Var = new a90(context, e6Var);
        a90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        a90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        a90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        a90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(a90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.b;
        if (j3 == UserObject.ANONYMOUS) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = yh.r7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = yh.r7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                str2 = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                str2 = chat == null ? "" : chat.title;
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            a90Var.setClickable(true);
            spannableStringBuilder.setSpan(new sc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        final m5 m5Var = new m5(AndroidUtilities.dp(20.0f), a90Var);
        m5Var.k(Integer.valueOf(v02));
        m5Var.I = AndroidUtilities.dp(12.0f);
        m5Var.J = 0;
        a90Var.addOnAttachStateChangeListener(new ai.u2(m5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.lz0
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
                long j10 = j3;
                if (j10 == UserObject.ANONYMOUS || UserObject.isService(j10)) {
                    return;
                }
                int i12 = i10;
                if (j10 > 0) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                    emojiStatus = user2 != null ? user2.emoji_status : null;
                    if (user2 != null && user2.premium) {
                        z11 = true;
                        emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                        m5 m5Var2 = m5Var;
                        a90 a90Var2 = a90Var;
                        if (emojiStatusDocumentId == 0) {
                            m5Var2.j(emojiStatusDocumentId, true);
                            m5Var2.m(DialogObject.isEmojiStatusCollectible(emojiStatus), true);
                            a90Var2.i(m5Var2);
                        } else if (z11) {
                            m5Var2.g(mutate, true);
                            m5Var2.m(false, true);
                            a90Var2.i(m5Var2);
                        } else {
                            a90Var2.i(null);
                        }
                        m5Var2.k(Integer.valueOf(v02));
                    }
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                    emojiStatus = chat2 != null ? chat2.emoji_status : null;
                }
                z11 = false;
                emojiStatusDocumentId = DialogObject.getEmojiStatusDocumentId(emojiStatus);
                m5 m5Var22 = m5Var;
                a90 a90Var22 = a90Var;
                if (emojiStatusDocumentId == 0) {
                }
                m5Var22.k(Integer.valueOf(v02));
            }
        };
        callback.run(null);
        a90Var.i(m5Var);
        NotificationCenter.getInstance(i10).listen(a90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(a90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        a90Var.l(spannableStringBuilder, false);
        return i(a90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        c90 c90Var = new c90(getContext(), null);
        c90Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        c90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.i6.j5;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        c90Var.setMaxLines(1);
        c90Var.setSingleLine();
        c90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        c90Var.setText(spannableStringBuilder);
        c90Var.setDisablePaddingsOffsetY(true);
        c90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(c90Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override // android.widget.TableLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f);
        int i14 = org.telegram.ui.ActionBar.i6.qh;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ph, e6Var));
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt = tableRow.getChildAt(i16);
                    if (childAt instanceof oz0) {
                        oz0 oz0Var = (oz0) childAt;
                        boolean z12 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (oz0Var.b != z12 || oz0Var.c != z11) {
                            oz0Var.b = z12;
                            oz0Var.c = z11;
                            oz0Var.invalidate();
                        }
                    } else if (childAt instanceof mz0) {
                        mz0 mz0Var = (mz0) childAt;
                        boolean z13 = i15 == 0;
                        boolean z14 = i15 == childCount + (-1);
                        if (mz0Var.b != z13 || mz0Var.c != z14) {
                            mz0Var.b = z13;
                            mz0Var.c = z14;
                            mz0Var.invalidate();
                        }
                        boolean z15 = i16 == 0;
                        z11 = i16 == childCount2 + (-1);
                        if (mz0Var.d != z15 || mz0Var.e != z11) {
                            mz0Var.d = z15;
                            mz0Var.e = z11;
                            mz0Var.invalidate();
                        }
                    } else if (childAt instanceof nz0) {
                        nz0 nz0Var = (nz0) childAt;
                        boolean z16 = i15 == 0;
                        z11 = i15 == childCount + (-1);
                        if (nz0Var.c != z16 || nz0Var.d != z11) {
                            nz0Var.c = z16;
                            nz0Var.d = z11;
                            nz0Var.invalidate();
                        }
                    }
                    i16++;
                }
            }
            i15++;
        }
    }
}
