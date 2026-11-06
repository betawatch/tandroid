package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e4 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public c d;
    public Paint e;
    public RectF f;
    public a0.h g;
    public a0.h h;
    public boolean i;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.i) {
            return 1;
        }
        return this.a.size() + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:118|(1:120)(2:129|(1:131)(9:132|(1:134)(1:136)|135|122|123|124|125|100|101))|121|122|123|124|125|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03e2, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05bc  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i7) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        boolean z9;
        Bitmap decodeFile;
        ij ijVar;
        TLRPC.Dialog dialog;
        int i10;
        int i11;
        int i12;
        TLRPC.Chat M0;
        TLRPC.User user2;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c10;
        char c11;
        String charSequence2;
        char c12;
        char c13;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        org.telegram.ui.Components.w8 w8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList arrayList = this.a;
        Context context = this.b;
        c cVar = this.d;
        if (this.i) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, hd.M0(2131742875, null));
            return remoteViews;
        }
        if (i7 >= arrayList.size()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, hd.M0(2131744258, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", cVar.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l10 = (Long) arrayList.get(i7);
        CharSequence charSequence5 = "";
        if (m5.E(l10.longValue())) {
            user = qp.s1(cVar.a).a2(l10);
            if (user != null) {
                str = t10.B(user) ? hd.M0(2131745902, null) : t10.z(user) ? hd.M0(2131746265, null) : t10.x(user) ? hd.M0(2131749327, null) : g5.m(0, user.first_name, user.last_name);
                if (t10.z(user) || t10.B(user) || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                    chat = null;
                    fileLocation = null;
                } else {
                    chat = null;
                }
            } else {
                chat = null;
                fileLocation = null;
                str = "";
            }
        } else {
            int i13 = cVar.a;
            int i14 = cVar.a;
            TLRPC.Chat M02 = qp.s1(i13).M0(Long.valueOf(-l10.longValue()));
            if (M02 != null) {
                if (t3.p0(M02)) {
                    String i15 = qg.d.i(i14, M02, false);
                    TLRPC.Chat M03 = qp.s1(i14).M0(Long.valueOf(M02.linked_monoforum_id));
                    if (M03 == null || (chatPhoto = M03.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                    fileLocation = fileLocation2;
                    str = i15;
                } else {
                    str = M02.title;
                    TLRPC.ChatPhoto chatPhoto2 = M02.photo;
                    if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                        chat = M02;
                        user = null;
                        fileLocation = null;
                    }
                }
                chat = M02;
                user = null;
            } else {
                chat = M02;
                user = null;
                fileLocation = null;
                str = "";
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                w7.G(p10.s0);
                decodeFile = BitmapFactory.decodeFile(w7.J(fileLocation, null, true, true).toString());
            } catch (Throwable th2) {
                th = th2;
                z9 = true;
                a8.g(th, z9);
                ijVar = (ij) this.h.f(l10.longValue());
                dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                if (ijVar != null) {
                }
                if (dialog != null) {
                }
                i11 = 0;
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (m5.E(l10.longValue())) {
                }
                bundle2.putInt("currentAccount", cVar.a);
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        try {
            int L = g0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (user != null) {
                    w8Var = new org.telegram.ui.Components.w8(0, user);
                    if (t10.z(user)) {
                        w8Var.g(12);
                    } else if (t10.B(user)) {
                        w8Var.g(1);
                    }
                } else {
                    w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                    int i16 = cVar.a;
                    w8Var.q(chat);
                }
                w8Var.setBounds(0, 0, L, L);
                w8Var.draw(canvas);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                if (this.e == null) {
                    this.e = new Paint(1);
                    this.f = new RectF();
                }
                float width = L / decodeFile.getWidth();
                canvas.save();
                canvas.scale(width, width);
                this.e.setShader(bitmapShader);
                this.f.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.f, decodeFile.getWidth(), decodeFile.getHeight(), this.e);
                canvas.restore();
            }
            canvas.setBitmap(null);
            remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
        } catch (Throwable th3) {
            th = th3;
            z9 = true;
            a8.g(th, z9);
            ijVar = (ij) this.h.f(l10.longValue());
            dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
            if (ijVar != null) {
            }
            if (dialog != null) {
            }
            i11 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            Bundle bundle22 = new Bundle();
            if (m5.E(l10.longValue())) {
            }
            bundle22.putInt("currentAccount", cVar.a);
            Intent intent22 = new Intent();
            intent22.putExtras(bundle22);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
            return remoteViews3;
        }
        ijVar = (ij) this.h.f(l10.longValue());
        dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
        if (ijVar != null) {
            long Z0 = ijVar.Z0();
            if (m5.E(Z0)) {
                user2 = qp.s1(cVar.a).a2(Long.valueOf(Z0));
                M0 = null;
            } else {
                M0 = qp.s1(cVar.a).M0(Long.valueOf(-Z0));
                user2 = null;
            }
            int color = context.getResources().getColor(R.color.widget_text);
            if (ijVar.k instanceof TLRPC.TL_messageService) {
                if (t3.T(chat)) {
                    TLRPC.MessageAction messageAction = ijVar.k.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = context.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = ijVar.v;
                color = context.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str2 = "📎 ";
                if (chat == null || M0 != null || (t3.T(chat) && !t3.n0(chat))) {
                    TLRPC.Message message = ijVar.k;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = hd.M0(2131753947, null);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = hd.M0(2131753932, null);
                    } else if (ijVar.z != null) {
                        if (ij.M4(message)) {
                            str2 = "📹 ";
                        } else if (ij.S4(ijVar.k)) {
                            str2 = "🎤 ";
                        } else if (ijVar.J3()) {
                            str2 = "🎧 ";
                        } else if (ij.T3(ijVar.k)) {
                            str2 = "🖼 ";
                        }
                        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                        m10.append((Object) ijVar.z);
                        charSequence3 = m10.toString();
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + ijVar.k.media.game.title;
                        } else if (ijVar.D == 14) {
                            charSequence = com.google.android.recaptcha.internal.a.l("🎧 ", ijVar.x1(true), " - ", ijVar.z1(true));
                        } else {
                            charSequence = ijVar.v;
                            g0.x1(charSequence, ijVar.Y1, null);
                        }
                        CharSequence charSequence6 = charSequence;
                        charSequence3 = charSequence6;
                        if (ijVar.k.media != null) {
                            charSequence3 = charSequence6;
                            if (!ijVar.G3()) {
                                color = context.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence6;
                            }
                        }
                    }
                } else {
                    String M04 = ijVar.Q3() ? hd.M0(2131750502, null) : user2 != null ? t10.j(user2, true).replace("\n", "") : "DELETED";
                    CharSequence charSequence7 = ijVar.z;
                    try {
                        if (charSequence7 != null) {
                            String charSequence8 = charSequence7.toString();
                            if (charSequence8.length() > 150) {
                                charSequence8 = charSequence8.substring(0, qs.g2);
                            }
                            if (ij.M4(ijVar.k)) {
                                str2 = "📹 ";
                            } else if (ij.S4(ijVar.k)) {
                                str2 = "🎤 ";
                            } else if (ijVar.J3()) {
                                str2 = "🎧 ";
                            } else if (ij.T3(ijVar.k)) {
                                str2 = "🖼 ";
                            }
                            StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str2);
                            m11.append(charSequence8.replace('\n', ' '));
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", m11.toString(), M04));
                        } else if (ijVar.k.media == null || ijVar.G3()) {
                            String str3 = ijVar.k.message;
                            if (str3 != null) {
                                if (str3.length() > 150) {
                                    c10 = 0;
                                    str3 = str3.substring(0, qs.g2);
                                } else {
                                    c10 = 0;
                                }
                                Object[] objArr = new Object[2];
                                objArr[c10] = str3.replace('\n', ' ').trim();
                                objArr[1] = M04;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = context.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = ijVar.k.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = a8.p0.p("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = a8.p0.p("🎮 \u2068", messageMedia2.game.title, "\u2069");
                            } else {
                                if (ijVar.D == 14) {
                                    c11 = 1;
                                    charSequence2 = org.telegram.ui.Cells.f1.m("🎧 \u2068", ijVar.x1(true), " - ", ijVar.z1(true), "\u2069");
                                } else {
                                    c11 = 1;
                                    charSequence2 = ijVar.v.toString();
                                }
                                c12 = ' ';
                                c13 = '\n';
                                String replace = charSequence2.replace(c13, c12);
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = replace;
                                objArr2[c11] = M04;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.o9, null), M04.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c12 = ' ';
                            c13 = '\n';
                            c11 = 1;
                            String replace2 = charSequence2.replace(c13, c12);
                            Object[] objArr22 = new Object[2];
                            objArr22[0] = replace2;
                            objArr22[c11] = M04;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.o9, null), M04.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, hd.e1(ijVar.k.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence3.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i10 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, hd.e1(i10));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i12 = dialog.unread_count) <= 0) {
            i11 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            i11 = 0;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i12)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (qp.s1(cVar.a).r2(dialog.id, 0L, null)) {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", false);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", true);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (m5.E(l10.longValue())) {
            bundle222.putLong("userId", l10.longValue());
        } else {
            bundle222.putLong("chatId", -l10.longValue());
        }
        bundle222.putInt("currentAccount", cVar.a);
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
        return remoteViews3;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        t0.w();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.a;
            if (p10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                yr a02 = yr.a0(i7);
                int i10 = this.c;
                a0.h hVar3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.a.c(new bg.c(a02, i10, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                qp.s1(i7).Y3(arrayList2, true);
                qp.s1(i7).S3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    hVar.k(new ij(cVar.a, (TLRPC.Message) hVar2.n(i11), (a0.h) null, (a0.h) null, false, true), hVar2.j(i11));
                }
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
