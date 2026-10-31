package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hy extends FrameLayout {
    public org.telegram.ui.Components.e9 a;
    public org.telegram.ui.Components.e9 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final /* synthetic */ iy r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(iy iyVar, Context context) {
        super(context);
        this.r = iyVar;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        addView(f7, w7.b6.e(-2, -2, 17));
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context);
        s0Var.setCustomText(org.telegram.messenger.cd.L0(2131742894, null));
        f7.addView(s0Var, w7.b6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f7.addView(linearLayout, w7.b6.t(-2, -2, 17, 10, 0, 10, 0));
        iyVar.d = new ImageView(context);
        int i11 = iyVar.x;
        if (i11 == 0) {
            while (i10 < 2) {
                this.n[i10] = (ViewGroup) iyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i10], w7.b6.o(-1, -2));
                i10++;
            }
            linearLayout.addView(iyVar.d, w7.b6.r(org.telegram.messenger.zs.v3, org.telegram.messenger.zs.q2, 17));
            iyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.n[i10] = (ViewGroup) iyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i10], w7.b6.o(org.telegram.messenger.zs.q2, -2));
                i10++;
            }
            linearLayout.addView(iyVar.d, w7.b6.r(org.telegram.messenger.zs.q2, org.telegram.messenger.zs.q2, 17));
            iyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.t6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:290|(1:292)(2:393|(1:395)(4:396|(1:398)(1:399)|294|(18:391|392|308|(1:310)(1:390)|311|312|(2:385|386)(1:314)|315|316|(4:(3:355|356|(3:358|359|360)(2:364|(1:366)))(1:319)|320|321|322)(6:370|371|372|373|374|375)|323|324|325|(1:327)(1:350)|328|329|330|(8:332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)|341|342)(4:345|(1:347)|348|349))(17:307|308|(0)(0)|311|312|(0)(0)|315|316|(0)(0)|323|324|325|(0)(0)|328|329|330|(0)(0))))|293|294|(1:296)|391|392|308|(0)(0)|311|312|(0)(0)|315|316|(0)(0)|323|324|325|(0)(0)|328|329|330|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:118|(1:120)(2:128|(1:130)(7:131|(1:133)(1:134)|122|123|124|100|101))|121|122|123|124|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03c5, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x084e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0858, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026e, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0785 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0776  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9, types: [android.graphics.Bitmap, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ViewGroup[] viewGroupArr;
        TLRPC.Dialog dialog;
        TLRPC.Dialog dialog2;
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        boolean z10;
        Bitmap decodeFile;
        int i10;
        int i11;
        String format;
        org.telegram.ui.Components.r8 r8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        TLRPC.Dialog dialog3;
        TLRPC.Dialog dialog4;
        int i12;
        TLRPC.Chat chat2;
        String str2;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation4;
        Bitmap decodeFile2;
        ViewGroup[] viewGroupArr2;
        TLRPC.Chat L0;
        TLRPC.User user3;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c10;
        char c11;
        String charSequence2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Drawable drawable;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation5;
        iy iyVar = this.r;
        ArrayList arrayList = iyVar.e;
        int i13 = iyVar.x;
        int i14 = 2131745918;
        int i15 = 8;
        int i16 = 0;
        ViewGroup[] viewGroupArr3 = this.n;
        ?? r12 = 0;
        if (i13 == 0) {
            int i17 = 0;
            for (int i18 = 2; i17 < i18; i18 = 2) {
                if (arrayList.isEmpty()) {
                    dialog4 = i17 < iyVar.getMessagesController().E.size() ? (TLRPC.Dialog) iyVar.getMessagesController().E.get(i17) : r12;
                } else if (i17 < arrayList.size()) {
                    dialog4 = (TLRPC.Dialog) iyVar.getMessagesController().Q.f(((Long) arrayList.get(i17)).longValue());
                    if (dialog4 == null) {
                        dialog4 = new TLRPC.TL_dialog();
                        dialog4.id = ((Long) arrayList.get(i17)).longValue();
                    }
                } else {
                    dialog3 = r12;
                    if (dialog3 != null) {
                        viewGroupArr3[i17].setVisibility(i15);
                        i12 = i17;
                        viewGroupArr2 = viewGroupArr3;
                    } else {
                        viewGroupArr3[i17].setVisibility(i16);
                        if (org.telegram.messenger.o5.E(dialog3.id)) {
                            user2 = iyVar.getMessagesController().Z1(Long.valueOf(dialog3.id));
                            if (user2 != null) {
                                String L02 = org.telegram.messenger.h20.B(user2) ? org.telegram.messenger.cd.L0(i14, r12) : org.telegram.messenger.h20.z(user2) ? org.telegram.messenger.cd.L0(2131746281, r12) : org.telegram.messenger.h20.x(user2) ? org.telegram.messenger.cd.L0(2131749337, r12) : org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
                                if (org.telegram.messenger.h20.z(user2) || org.telegram.messenger.h20.B(user2) || (userProfilePhoto2 = user2.photo) == null || (fileLocation5 = userProfilePhoto2.photo_small) == 0) {
                                    i12 = i17;
                                } else {
                                    i12 = i17;
                                    if (fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                        str2 = L02;
                                        chat3 = fileLocation5;
                                        chat2 = r12;
                                    }
                                }
                                str2 = L02;
                            } else {
                                i12 = i17;
                                str2 = "";
                            }
                            chat2 = r12;
                            chat3 = chat2;
                        } else {
                            i12 = i17;
                            TLRPC.Chat L03 = iyVar.getMessagesController().L0(Long.valueOf(-dialog3.id));
                            if (L03 != null) {
                                String str3 = L03.title;
                                TLRPC.ChatPhoto chatPhoto = L03.photo;
                                if (chatPhoto == null || (fileLocation4 = chatPhoto.photo_small) == 0 || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) {
                                    chat2 = L03;
                                    str2 = str3;
                                } else {
                                    str2 = str3;
                                    chat3 = fileLocation4;
                                    chat2 = L03;
                                    user2 = r12;
                                }
                            } else {
                                chat2 = L03;
                                str2 = "";
                            }
                            user2 = r12;
                            chat3 = user2;
                        }
                        ((TextView) viewGroupArr3[i12].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                        if (chat3 != null) {
                            try {
                                iyVar.getFileLoader().getClass();
                                decodeFile2 = BitmapFactory.decodeFile(org.telegram.messenger.b8.K(chat3, r12, true, true).toString());
                            } catch (Throwable th2) {
                                org.telegram.messenger.f8.g(th2, true);
                            }
                        } else {
                            decodeFile2 = r12;
                        }
                        int L = org.telegram.messenger.i0.L(48.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                        createBitmap.eraseColor(0);
                        Canvas canvas = new Canvas(createBitmap);
                        if (decodeFile2 == null) {
                            if (user2 != null) {
                                org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8(0, user2);
                                if (org.telegram.messenger.h20.z(user2)) {
                                    r8Var2.g(12);
                                    drawable = r8Var2;
                                } else {
                                    drawable = r8Var2;
                                    if (org.telegram.messenger.h20.B(user2)) {
                                        r8Var2.g(1);
                                        drawable = r8Var2;
                                    }
                                }
                            } else {
                                drawable = new org.telegram.ui.Components.r8(chat2);
                            }
                            drawable.setBounds(0, 0, L, L);
                            drawable.draw(canvas);
                        } else {
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(decodeFile2, tileMode, tileMode);
                            if (this.f == null) {
                                this.f = new Paint(1);
                                this.h = new RectF();
                            }
                            float width = L / decodeFile2.getWidth();
                            canvas.save();
                            canvas.scale(width, width);
                            this.f.setShader(bitmapShader);
                            this.h.set(0.0f, 0.0f, decodeFile2.getWidth(), decodeFile2.getHeight());
                            canvas.drawRoundRect(this.h, decodeFile2.getWidth(), decodeFile2.getHeight(), this.f);
                            canvas.restore();
                        }
                        canvas.setBitmap(r12);
                        ((ImageView) viewGroupArr3[i12].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap);
                        ArrayList arrayList2 = (ArrayList) iyVar.getMessagesController().R.f(dialog3.id);
                        org.telegram.messenger.jj jjVar = (arrayList2 == null || arrayList2.size() <= 0) ? r12 : (org.telegram.messenger.jj) arrayList2.get(0);
                        if (jjVar != null) {
                            long Z0 = jjVar.Z0();
                            if (Z0 > 0) {
                                user3 = iyVar.getMessagesController().Z1(Long.valueOf(Z0));
                                L0 = r12;
                            } else {
                                L0 = iyVar.getMessagesController().L0(Long.valueOf(-Z0));
                                user3 = r12;
                            }
                            int color = getContext().getResources().getColor(R.color.widget_text);
                            if (jjVar.k instanceof TLRPC.TL_messageService) {
                                if (org.telegram.messenger.w3.T(chat2)) {
                                    TLRPC.MessageAction messageAction = jjVar.k.action;
                                    charSequence4 = "";
                                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        charSequence4 = "";
                                    }
                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                    viewGroupArr2 = viewGroupArr3;
                                    charSequence3 = charSequence4;
                                }
                                charSequence4 = jjVar.v;
                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                viewGroupArr2 = viewGroupArr3;
                                charSequence3 = charSequence4;
                            } else {
                                String str4 = "📎 ";
                                viewGroupArr2 = viewGroupArr3;
                                if (chat2 == null || chat2.id <= 0 || L0 != null || (org.telegram.messenger.w3.T(chat2) && !org.telegram.messenger.w3.n0(chat2))) {
                                    TLRPC.Message message = jjVar.k;
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequence3 = org.telegram.messenger.cd.L0(2131753947, null);
                                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequence3 = org.telegram.messenger.cd.L0(2131753932, null);
                                    } else if (jjVar.z != null) {
                                        if (org.telegram.messenger.jj.L4(message)) {
                                            str4 = "📹 ";
                                        } else if (org.telegram.messenger.jj.R4(jjVar.k)) {
                                            str4 = "🎤 ";
                                        } else if (jjVar.I3()) {
                                            str4 = "🎧 ";
                                        } else if (org.telegram.messenger.jj.S3(jjVar.k)) {
                                            str4 = "🖼 ";
                                        }
                                        StringBuilder t10 = a1.g.t(str4);
                                        t10.append((Object) jjVar.z);
                                        charSequence3 = t10.toString();
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            charSequence = "🎮 " + jjVar.k.media.game.title;
                                        } else if (jjVar.D == 14) {
                                            charSequence = c3.i0.n("🎧 ", jjVar.x1(true), " - ", jjVar.z1(true));
                                        } else {
                                            charSequence = jjVar.v;
                                            org.telegram.messenger.i0.x1(charSequence, jjVar.Y1, null);
                                        }
                                        CharSequence charSequence5 = charSequence;
                                        charSequence3 = charSequence5;
                                        if (jjVar.k.media != null) {
                                            charSequence3 = charSequence5;
                                            if (!jjVar.F3()) {
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                charSequence3 = charSequence5;
                                            }
                                        }
                                    }
                                } else {
                                    String L04 = jjVar.P3() ? org.telegram.messenger.cd.L0(2131750512, r12) : user3 != null ? org.telegram.messenger.h20.j(user3, true).replace("\n", "") : "DELETED";
                                    CharSequence charSequence6 = jjVar.z;
                                    try {
                                        if (charSequence6 != null) {
                                            String charSequence7 = charSequence6.toString();
                                            if (charSequence7.length() > 150) {
                                                charSequence7 = charSequence7.substring(0, org.telegram.messenger.zs.g2);
                                            }
                                            if (org.telegram.messenger.jj.L4(jjVar.k)) {
                                                str4 = "📹 ";
                                            } else if (org.telegram.messenger.jj.R4(jjVar.k)) {
                                                str4 = "🎤 ";
                                            } else if (jjVar.I3()) {
                                                str4 = "🎧 ";
                                            } else if (org.telegram.messenger.jj.S3(jjVar.k)) {
                                                str4 = "🖼 ";
                                            }
                                            StringBuilder t11 = a1.g.t(str4);
                                            t11.append(charSequence7.replace('\n', ' '));
                                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", t11.toString(), L04));
                                        } else if (jjVar.k.media == null || jjVar.F3()) {
                                            String str5 = jjVar.k.message;
                                            if (str5 != null) {
                                                if (str5.length() > 150) {
                                                    c10 = 0;
                                                    str5 = str5.substring(0, org.telegram.messenger.zs.g2);
                                                } else {
                                                    c10 = 0;
                                                }
                                                Object[] objArr = new Object[2];
                                                objArr[c10] = str5.replace('\n', ' ').trim();
                                                objArr[1] = L04;
                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                            } else {
                                                valueOf = SpannableStringBuilder.valueOf("");
                                            }
                                        } else {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            TLRPC.MessageMedia messageMedia2 = jjVar.k.media;
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                charSequence2 = a1.g.n("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                charSequence2 = a1.g.n("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                            } else {
                                                if (jjVar.D == 14) {
                                                    c11 = 1;
                                                    charSequence2 = org.telegram.ui.Cells.f1.o("🎧 \u2068", jjVar.x1(true), " - ", jjVar.z1(true), "\u2069");
                                                } else {
                                                    c11 = 1;
                                                    charSequence2 = jjVar.v.toString();
                                                }
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = charSequence2.replace('\n', ' ');
                                                objArr2[c11] = L04;
                                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                valueOf2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.o9, null), L04.length() + 2, valueOf2.length(), 33);
                                                spannableStringBuilder = valueOf2;
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                                                charSequence3 = spannableStringBuilder;
                                            }
                                            c11 = 1;
                                            Object[] objArr22 = new Object[2];
                                            objArr22[0] = charSequence2.replace('\n', ' ');
                                            objArr22[c11] = L04;
                                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                                            valueOf22.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.o9, null), L04.length() + 2, valueOf22.length(), 33);
                                            spannableStringBuilder = valueOf22;
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                                            charSequence3 = spannableStringBuilder;
                                        }
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                                        charSequence3 = spannableStringBuilder;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        charSequence3 = spannableStringBuilder;
                                    }
                                    spannableStringBuilder = valueOf;
                                }
                            }
                            ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_time)).setText(org.telegram.messenger.cd.a1(jjVar.k.date));
                            ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_message)).setText(charSequence3.toString());
                            ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_message)).setTextColor(color);
                        } else {
                            viewGroupArr2 = viewGroupArr3;
                            if (dialog3.last_message_date != 0) {
                                ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_time)).setText(org.telegram.messenger.cd.a1(dialog3.last_message_date));
                            } else {
                                ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_time)).setText("");
                            }
                            ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_message)).setText("");
                        }
                        if (dialog3.unread_count > 0) {
                            ((TextView) viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_badge)).setText(String.format("%d", Integer.valueOf(dialog3.unread_count)));
                            viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_badge).setVisibility(0);
                            if (iyVar.getMessagesController().q2(dialog3.id, 0L, null)) {
                                viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter_muted);
                            } else {
                                viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter);
                            }
                        } else {
                            viewGroupArr2[i12].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                        }
                    }
                    i17 = i12 + 1;
                    viewGroupArr3 = viewGroupArr2;
                    i16 = 0;
                    i14 = 2131745918;
                    r12 = 0;
                    i15 = 8;
                }
                dialog3 = dialog4;
                if (dialog3 != null) {
                }
                i17 = i12 + 1;
                viewGroupArr3 = viewGroupArr2;
                i16 = 0;
                i14 = 2131745918;
                r12 = 0;
                i15 = 8;
            }
            viewGroupArr = viewGroupArr3;
            viewGroupArr[i16].findViewById(R.id.shortcut_widget_item_divider).setVisibility(viewGroupArr[1].getVisibility());
            viewGroupArr[1].findViewById(R.id.shortcut_widget_item_divider).setVisibility(8);
        } else {
            viewGroupArr = viewGroupArr3;
            if (i13 == 1) {
                int i19 = 0;
                while (true) {
                    if (i19 >= 2) {
                        break;
                    }
                    int i20 = 0;
                    for (int i21 = 2; i20 < i21; i21 = 2) {
                        int i22 = (i19 * 2) + i20;
                        if (arrayList.isEmpty()) {
                            if (i22 < iyVar.getMediaDataController().i1.size()) {
                                long j10 = ((TLRPC.TL_topPeer) iyVar.getMediaDataController().i1.get(i22)).peer.user_id;
                                dialog = (TLRPC.Dialog) iyVar.getMessagesController().Q.f(j10);
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = j10;
                                }
                                dialog2 = dialog;
                            }
                            dialog2 = null;
                        } else {
                            if (i22 < arrayList.size()) {
                                dialog = (TLRPC.Dialog) iyVar.getMessagesController().Q.f(((Long) arrayList.get(i22)).longValue());
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = ((Long) arrayList.get(i22)).longValue();
                                }
                                dialog2 = dialog;
                            }
                            dialog2 = null;
                        }
                        int i23 = R.id.contacts_widget_item2;
                        if (dialog2 == null) {
                            ViewGroup viewGroup = viewGroupArr[i19];
                            if (i20 == 0) {
                                i23 = R.id.contacts_widget_item1;
                            }
                            viewGroup.findViewById(i23).setVisibility(4);
                            if (i22 == 0 || i22 == 2) {
                                viewGroupArr[i19].setVisibility(8);
                            }
                        } else {
                            ViewGroup viewGroup2 = viewGroupArr[i19];
                            if (i20 == 0) {
                                i23 = R.id.contacts_widget_item1;
                            }
                            viewGroup2.findViewById(i23).setVisibility(0);
                            if (i22 == 0 || i22 == 2) {
                                viewGroupArr[i19].setVisibility(0);
                            }
                            if (org.telegram.messenger.o5.E(dialog2.id)) {
                                user = iyVar.getMessagesController().Z1(Long.valueOf(dialog2.id));
                                if (org.telegram.messenger.h20.B(user)) {
                                    str = org.telegram.messenger.cd.L0(2131745918, null);
                                } else if (org.telegram.messenger.h20.z(user)) {
                                    str = org.telegram.messenger.cd.L0(2131746281, null);
                                } else {
                                    str = org.telegram.messenger.h20.x(user) ? org.telegram.messenger.cd.L0(2131749337, null) : org.telegram.messenger.h20.j(user, true);
                                    if (!org.telegram.messenger.h20.z(user) || org.telegram.messenger.h20.B(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                                        chat = null;
                                        fileLocation2 = null;
                                        ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                        if (fileLocation2 != null) {
                                            try {
                                                iyVar.getFileLoader().getClass();
                                                decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.b8.K(fileLocation2, null, true, true).toString());
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z10 = 1;
                                                org.telegram.messenger.f8.g(th, z10);
                                                i10 = z10;
                                                i11 = dialog2.unread_count;
                                                int i24 = R.id.contacts_widget_item_badge_bg2;
                                                if (i11 > 0) {
                                                }
                                                i20++;
                                            }
                                        } else {
                                            decodeFile = null;
                                        }
                                        int L2 = org.telegram.messenger.i0.L(48.0f);
                                        Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                                        createBitmap2.eraseColor(0);
                                        Canvas canvas2 = new Canvas(createBitmap2);
                                        if (decodeFile == null) {
                                            if (user != null) {
                                                try {
                                                    r8Var = new org.telegram.ui.Components.r8(0, user);
                                                    if (org.telegram.messenger.h20.z(user)) {
                                                        try {
                                                            r8Var.g(12);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z10 = 1;
                                                            org.telegram.messenger.f8.g(th, z10);
                                                            i10 = z10;
                                                            i11 = dialog2.unread_count;
                                                            int i242 = R.id.contacts_widget_item_badge_bg2;
                                                            if (i11 > 0) {
                                                            }
                                                            i20++;
                                                        }
                                                    } else if (org.telegram.messenger.h20.B(user)) {
                                                        r8Var.g(1);
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            } else {
                                                r8Var = new org.telegram.ui.Components.r8(chat);
                                            }
                                            r8Var.setBounds(0, 0, L2, L2);
                                            r8Var.draw(canvas2);
                                        } else {
                                            try {
                                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                                BitmapShader bitmapShader2 = new BitmapShader(decodeFile, tileMode2, tileMode2);
                                                float width2 = L2 / decodeFile.getWidth();
                                                canvas2.save();
                                                canvas2.scale(width2, width2);
                                                this.f.setShader(bitmapShader2);
                                                try {
                                                    this.h.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                                    canvas2.drawRoundRect(this.h, decodeFile.getWidth(), decodeFile.getHeight(), this.f);
                                                    canvas2.restore();
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    z10 = 1;
                                                    org.telegram.messenger.f8.g(th, z10);
                                                    i10 = z10;
                                                    i11 = dialog2.unread_count;
                                                    int i2422 = R.id.contacts_widget_item_badge_bg2;
                                                    if (i11 > 0) {
                                                    }
                                                    i20++;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        }
                                        canvas2.setBitmap(null);
                                        ((ImageView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap2);
                                        i10 = 1;
                                        i11 = dialog2.unread_count;
                                        int i24222 = R.id.contacts_widget_item_badge_bg2;
                                        if (i11 > 0) {
                                            if (i11 > 99) {
                                                Object[] objArr3 = new Object[i10];
                                                objArr3[0] = 99;
                                                format = String.format("%d+", objArr3);
                                            } else {
                                                Object[] objArr4 = new Object[i10];
                                                objArr4[0] = Integer.valueOf(i11);
                                                format = String.format("%d", objArr4);
                                            }
                                            ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(format);
                                            ViewGroup viewGroup3 = viewGroupArr[i19];
                                            if (i20 == 0) {
                                                i24222 = R.id.contacts_widget_item_badge_bg1;
                                            }
                                            viewGroup3.findViewById(i24222).setVisibility(0);
                                        } else {
                                            ViewGroup viewGroup4 = viewGroupArr[i19];
                                            if (i20 == 0) {
                                                i24222 = R.id.contacts_widget_item_badge_bg1;
                                            }
                                            viewGroup4.findViewById(i24222).setVisibility(8);
                                        }
                                    } else {
                                        fileLocation2 = fileLocation3;
                                        chat = null;
                                        ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                        if (fileLocation2 != null) {
                                        }
                                        int L22 = org.telegram.messenger.i0.L(48.0f);
                                        Bitmap createBitmap22 = Bitmap.createBitmap(L22, L22, Bitmap.Config.ARGB_8888);
                                        createBitmap22.eraseColor(0);
                                        Canvas canvas22 = new Canvas(createBitmap22);
                                        if (decodeFile == null) {
                                        }
                                        canvas22.setBitmap(null);
                                        ((ImageView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap22);
                                        i10 = 1;
                                        i11 = dialog2.unread_count;
                                        int i242222 = R.id.contacts_widget_item_badge_bg2;
                                        if (i11 > 0) {
                                        }
                                    }
                                }
                                if (org.telegram.messenger.h20.z(user)) {
                                }
                                chat = null;
                                fileLocation2 = null;
                                ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                if (fileLocation2 != null) {
                                }
                                int L222 = org.telegram.messenger.i0.L(48.0f);
                                Bitmap createBitmap222 = Bitmap.createBitmap(L222, L222, Bitmap.Config.ARGB_8888);
                                createBitmap222.eraseColor(0);
                                Canvas canvas222 = new Canvas(createBitmap222);
                                if (decodeFile == null) {
                                }
                                canvas222.setBitmap(null);
                                ((ImageView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap222);
                                i10 = 1;
                                i11 = dialog2.unread_count;
                                int i2422222 = R.id.contacts_widget_item_badge_bg2;
                                if (i11 > 0) {
                                }
                            } else {
                                TLRPC.Chat L05 = iyVar.getMessagesController().L0(Long.valueOf(-dialog2.id));
                                str = L05.title;
                                TLRPC.ChatPhoto chatPhoto2 = L05.photo;
                                if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                    chat = L05;
                                    user = null;
                                    fileLocation2 = null;
                                    ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                    if (fileLocation2 != null) {
                                    }
                                    int L2222 = org.telegram.messenger.i0.L(48.0f);
                                    Bitmap createBitmap2222 = Bitmap.createBitmap(L2222, L2222, Bitmap.Config.ARGB_8888);
                                    createBitmap2222.eraseColor(0);
                                    Canvas canvas2222 = new Canvas(createBitmap2222);
                                    if (decodeFile == null) {
                                    }
                                    canvas2222.setBitmap(null);
                                    ((ImageView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap2222);
                                    i10 = 1;
                                    i11 = dialog2.unread_count;
                                    int i24222222 = R.id.contacts_widget_item_badge_bg2;
                                    if (i11 > 0) {
                                    }
                                } else {
                                    fileLocation2 = fileLocation;
                                    chat = L05;
                                    user = null;
                                    ((TextView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                    if (fileLocation2 != null) {
                                    }
                                    int L22222 = org.telegram.messenger.i0.L(48.0f);
                                    Bitmap createBitmap22222 = Bitmap.createBitmap(L22222, L22222, Bitmap.Config.ARGB_8888);
                                    createBitmap22222.eraseColor(0);
                                    Canvas canvas22222 = new Canvas(createBitmap22222);
                                    if (decodeFile == null) {
                                    }
                                    canvas22222.setBitmap(null);
                                    ((ImageView) viewGroupArr[i19].findViewById(i20 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap22222);
                                    i10 = 1;
                                    i11 = dialog2.unread_count;
                                    int i242222222 = R.id.contacts_widget_item_badge_bg2;
                                    if (i11 > 0) {
                                    }
                                }
                            }
                        }
                        i20++;
                    }
                    i19++;
                }
            }
        }
        if (viewGroupArr[0].getVisibility() == 0) {
            iyVar.d.setVisibility(8);
        } else {
            iyVar.d.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.e9 e9Var = this.a;
        if (e9Var != null) {
            e9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.e9 e9Var2 = this.b;
        if (e9Var2 != null) {
            e9Var2.dispose();
            this.b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.Components.e9 e9Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
        if (t02 != this.c && t02 != null) {
            if (org.telegram.ui.ActionBar.t6.h1()) {
                this.d = this.c;
                this.b = this.a;
            } else {
                org.telegram.ui.Components.e9 e9Var2 = this.a;
                if (e9Var2 != null) {
                    e9Var2.dispose();
                    this.a = null;
                }
            }
            this.c = t02;
        }
        iy iyVar = this.r;
        z4Var = ((org.telegram.ui.ActionBar.k2) iyVar).parentLayout;
        float themeAnimationValue = z4Var.getThemeAnimationValue();
        int i10 = 0;
        while (i10 < 2) {
            Drawable drawable = i10 == 0 ? this.d : this.c;
            if (drawable != null) {
                if (i10 == 1 && this.d != null) {
                    z4Var2 = ((org.telegram.ui.ActionBar.k2) iyVar).parentLayout;
                    if (z4Var2 != null) {
                        drawable.setAlpha((int) (255.0f * themeAnimationValue));
                        if (!(drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.jb0)) {
                            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            if (drawable instanceof org.telegram.ui.Components.f9) {
                                drawable.draw(canvas);
                            } else {
                                this.a = ((org.telegram.ui.Components.f9) drawable).c(canvas, this);
                            }
                        } else if (drawable instanceof BitmapDrawable) {
                            if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f7 = 2.0f / org.telegram.messenger.i0.p;
                                canvas.scale(f7, f7);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i11 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                        if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                            e9Var = this.b;
                            if (e9Var != null) {
                                e9Var.dispose();
                                this.b = null;
                            }
                            this.d = null;
                            invalidate();
                        }
                    }
                }
                drawable.setAlpha(org.telegram.messenger.zs.e4);
                if (drawable instanceof ColorDrawable) {
                }
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (drawable instanceof org.telegram.ui.Components.f9) {
                }
                if (i10 == 0) {
                    e9Var = this.b;
                    if (e9Var != null) {
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i10++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable2 = this.e;
        drawable2.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable2.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(264.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
