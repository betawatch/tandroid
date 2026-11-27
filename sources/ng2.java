// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ng2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public k5 d;
    public Paint e;
    public RectF f;
    public zh6 g;
    public zh6 h;
    public boolean i;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.i) {
            return 1;
        }
        return this.a.size() + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:117|(1:119)(2:128|(1:130)(9:131|(1:133)(1:135)|134|121|122|123|124|99|100))|120|121|122|123|124|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03dd, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028e, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05af  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        boolean z;
        Bitmap decodeFile;
        r47 r47Var;
        TLRPC.Dialog dialog;
        int i2;
        int i3;
        int i4;
        TLRPC.Chat M0;
        TLRPC.User user2;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c;
        char c2;
        String charSequence2;
        char c3;
        char c4;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        rb0 rb0Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList arrayList = this.a;
        Context context = this.b;
        k5 k5Var = this.d;
        if (this.i) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, ob6.M0(2131742505, null));
            return remoteViews;
        }
        if (i >= arrayList.size()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, ob6.M0(2131743910, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", k5Var.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l = (Long) arrayList.get(i);
        CharSequence charSequence5 = "";
        if (wf3.D(l.longValue())) {
            user = uc7.s1(k5Var.a).X1(l);
            if (user != null) {
                str = lbc.D(user) ? ob6.M0(2131745629, null) : lbc.B(user) ? ob6.M0(2131745993, null) : lbc.z(user) ? ob6.M0(2131749082, null) : lv2.m(0, user.first_name, user.last_name);
                if (lbc.B(user) || lbc.D(user) || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
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
            int i5 = k5Var.a;
            int i6 = k5Var.a;
            TLRPC.Chat M02 = uc7.s1(i5).M0(Long.valueOf(-l.longValue()));
            if (M02 != null) {
                if (xc2.p0(M02)) {
                    String j = ro4.j(i6, M02, false);
                    TLRPC.Chat M03 = uc7.s1(i6).M0(Long.valueOf(M02.linked_monoforum_id));
                    if (M03 == null || (chatPhoto = M03.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                    fileLocation = fileLocation2;
                    str = j;
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
                xb4.G(yac.t0);
                decodeFile = BitmapFactory.decodeFile(xb4.J(fileLocation, null, true, true).toString());
            } catch (Throwable th) {
                th = th;
                z = true;
                cc4.g(th, z);
                r47Var = (r47) this.h.f(l.longValue());
                dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                if (r47Var != null) {
                }
                if (dialog != null) {
                }
                i3 = 0;
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (wf3.D(l.longValue())) {
                }
                bundle2.putInt("currentAccount", k5Var.a);
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        try {
            int L = hl.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (user != null) {
                    rb0Var = new rb0(0, user);
                    if (lbc.B(user)) {
                        rb0Var.f(12);
                    } else if (lbc.D(user)) {
                        rb0Var.f(1);
                    }
                } else {
                    rb0Var = new rb0((vnb) null);
                    int i7 = k5Var.a;
                    rb0Var.p(chat);
                }
                rb0Var.setBounds(0, 0, L, L);
                rb0Var.draw(canvas);
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
        } catch (Throwable th2) {
            th = th2;
            z = true;
            cc4.g(th, z);
            r47Var = (r47) this.h.f(l.longValue());
            dialog = (TLRPC.Dialog) this.g.f(l.longValue());
            if (r47Var != null) {
            }
            if (dialog != null) {
            }
            i3 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            Bundle bundle22 = new Bundle();
            if (wf3.D(l.longValue())) {
            }
            bundle22.putInt("currentAccount", k5Var.a);
            Intent intent22 = new Intent();
            intent22.putExtras(bundle22);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
            return remoteViews3;
        }
        r47Var = (r47) this.h.f(l.longValue());
        dialog = (TLRPC.Dialog) this.g.f(l.longValue());
        if (r47Var != null) {
            long Z0 = r47Var.Z0();
            if (wf3.D(Z0)) {
                user2 = uc7.s1(k5Var.a).X1(Long.valueOf(Z0));
                M0 = null;
            } else {
                M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-Z0));
                user2 = null;
            }
            int color = context.getResources().getColor(R.color.widget_text);
            if (r47Var.k instanceof TLRPC.TL_messageService) {
                if (xc2.T(chat)) {
                    TLRPC.MessageAction messageAction = r47Var.k.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = context.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = r47Var.v;
                color = context.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str2 = "🎧 ";
                if (chat == null || M0 != null || (xc2.T(chat) && !xc2.n0(chat))) {
                    TLRPC.Message message = r47Var.k;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = ob6.M0(2131753940, null);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = ob6.M0(2131753925, null);
                    } else if (r47Var.z != null) {
                        if (r47.K4(message)) {
                            str2 = "📹 ";
                        } else if (r47.Q4(r47Var.k)) {
                            str2 = "🎤 ";
                        } else if (!r47Var.I3()) {
                            str2 = r47.R3(r47Var.k) ? "🖼 " : "📎 ";
                        }
                        charSequence3 = str2 + ((Object) r47Var.z);
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + r47Var.k.media.game.title;
                        } else if (r47Var.D == 14) {
                            charSequence = qd4.q("🎧 ", r47Var.w1(true), " - ", r47Var.y1(true));
                        } else {
                            charSequence = r47Var.v;
                            hl.v1(charSequence, r47Var.a2, null);
                        }
                        CharSequence charSequence6 = charSequence;
                        charSequence3 = charSequence6;
                        if (r47Var.k.media != null) {
                            charSequence3 = charSequence6;
                            if (!r47Var.F3()) {
                                color = context.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence6;
                            }
                        }
                    }
                } else {
                    String M04 = r47Var.O3() ? ob6.M0(2131750464, null) : user2 != null ? lbc.k(user2, true).replace("\n", "") : "DELETED";
                    CharSequence charSequence7 = r47Var.z;
                    try {
                        if (charSequence7 != null) {
                            String charSequence8 = charSequence7.toString();
                            if (charSequence8.length() > 150) {
                                charSequence8 = charSequence8.substring(0, jn7.f2);
                            }
                            if (r47.K4(r47Var.k)) {
                                str2 = "📹 ";
                            } else if (r47.Q4(r47Var.k)) {
                                str2 = "🎤 ";
                            } else if (!r47Var.I3()) {
                                str2 = r47.R3(r47Var.k) ? "🖼 " : "📎 ";
                            }
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str2 + charSequence8.replace('\n', ' '), M04));
                        } else if (r47Var.k.media == null || r47Var.F3()) {
                            String str3 = r47Var.k.message;
                            if (str3 != null) {
                                if (str3.length() > 150) {
                                    c = 0;
                                    str3 = str3.substring(0, jn7.f2);
                                } else {
                                    c = 0;
                                }
                                Object[] objArr = new Object[2];
                                objArr[c] = str3.replace('\n', ' ').trim();
                                objArr[1] = M04;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = context.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = qd4.y("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = qd4.y("🎮 \u2068", messageMedia2.game.title, "\u2069");
                            } else {
                                if (r47Var.D == 14) {
                                    c2 = 1;
                                    charSequence2 = c00.j("🎧 \u2068", r47Var.w1(true), " - ", r47Var.y1(true), "\u2069");
                                } else {
                                    c2 = 1;
                                    charSequence2 = r47Var.v.toString();
                                }
                                c3 = ' ';
                                c4 = '\n';
                                String replace = charSequence2.replace(c4, c3);
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = replace;
                                objArr2[c2] = M04;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new ho4(aob.o9, null), M04.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c3 = ' ';
                            c4 = '\n';
                            c2 = 1;
                            String replace2 = charSequence2.replace(c4, c3);
                            Object[] objArr22 = new Object[2];
                            objArr22[0] = replace2;
                            objArr22[c2] = M04;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new ho4(aob.o9, null), M04.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, ob6.e1(r47Var.k.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence3.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i2 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, ob6.e1(i2));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i4 = dialog.unread_count) <= 0) {
            i3 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            i3 = 0;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i4)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (uc7.s1(k5Var.a).p2(dialog.id, 0L, null)) {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (wf3.D(l.longValue())) {
            bundle222.putLong("userId", l.longValue());
        } else {
            bundle222.putLong("chatId", -l.longValue());
        }
        bundle222.putInt("currentAccount", k5Var.a);
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
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
        a.v();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        zh6 zh6Var = this.h;
        zh6Var.b();
        k5 k5Var = this.d;
        if (k5Var != null) {
            int i = k5Var.a;
            if (yac.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                zh6 zh6Var2 = new zh6();
                jf7 Y = jf7.Y(i);
                int i2 = this.c;
                zh6 zh6Var3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new re7(Y, i2, arrayList, 0, zh6Var3, zh6Var2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                uc7.s1(i).j4(arrayList2, true);
                uc7.s1(i).c4(arrayList3, true);
                zh6Var.b();
                int m = zh6Var2.m();
                for (int i3 = 0; i3 < m; i3++) {
                    zh6Var.k(zh6Var2.j(i3), new r47(k5Var.a, (TLRPC.Message) zh6Var2.n(i3), (zh6) null, (zh6) null, false, true));
                }
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
