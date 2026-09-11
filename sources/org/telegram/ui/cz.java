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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class cz extends FrameLayout {
    public org.telegram.ui.Components.v9 a;
    public org.telegram.ui.Components.v9 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final /* synthetic */ dz r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(dz dzVar, Context context) {
        super(context);
        this.r = dzVar;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        addView(f7, w7.x5.e(-2, -2, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        w0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f7.addView(w0Var, w7.x5.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f7.addView(linearLayout, w7.x5.t(-2, -2, 17, 10, 0, 10, 0));
        dzVar.d = new ImageView(context);
        int i11 = dzVar.w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.n[i10] = (ViewGroup) dzVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i10], w7.x5.n(-1, -2));
                i10++;
            }
            linearLayout.addView(dzVar.d, w7.x5.q(218, 160, 17));
            dzVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.n[i10] = (ViewGroup) dzVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i10], w7.x5.n(160, -2));
                i10++;
            }
            linearLayout.addView(dzVar.d, w7.x5.q(160, 160, 17));
            dzVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:17|(4:19|(1:21)(2:221|(1:223)(2:224|(1:226)(1:227)))|22|(1:220)(2:30|(13:34|35|(2:216|217)(1:37)|38|(2:(2:41|(1:43)(2:203|(1:205)))(1:206)|44)(5:207|(1:209)|210|211|212)|45|46|47|48|(1:199)(1:52)|(5:54|(1:56)(1:193)|57|(4:59|(3:61|(1:63)|65)|77|65)(2:78|(2:148|(2:155|(2:162|(3:164|(1:166)(2:168|(1:170)(2:171|(1:173)(2:174|(1:176))))|167)(5:177|(1:179)(2:186|(1:188)(2:189|(1:191)(1:192)))|180|181|(2:183|(1:185))))(1:161))(1:154))(8:87|(1:89)(1:(1:146)(1:147))|90|91|(5:93|(1:95)|96|(1:98)(2:106|(1:108)(2:109|(1:111)(2:112|(1:114))))|99)(2:115|(2:136|(4:138|(1:140)(1:143)|141|142)(1:144))(7:119|(1:121)(2:128|(1:130)(3:131|(1:133)(1:135)|134))|122|123|124|101|102))|100|101|102))|66)(3:194|(1:196)(1:198)|197)|67|(2:69|(2:71|72)(2:73|74))(2:75|76))))(1:228)|218|219|35|(0)(0)|38|(0)(0)|45|46|47|48|(1:50)|199|(0)(0)|67|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x025f, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x018d A[Catch: all -> 0x0146, TryCatch #6 {all -> 0x0146, blocks: (B:217:0x0135, B:38:0x014c, B:41:0x0162, B:43:0x016d, B:44:0x0182, B:203:0x0173, B:205:0x0179, B:206:0x017d, B:207:0x018d, B:209:0x0198, B:210:0x01a6), top: B:216:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x058c  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        TLRPC.Dialog dialog;
        String str;
        TLRPC.FileLocation fileLocation;
        TLRPC.Chat chat;
        TLRPC.User user;
        Bitmap decodeFile;
        int i10;
        org.telegram.ui.Components.i9 i9Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        long j3;
        TLRPC.Dialog dialog2;
        int i11;
        TLRPC.Chat chat2;
        String str2;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Bitmap decodeFile2;
        char c10;
        MessageObject messageObject;
        TLRPC.Chat chat3;
        TLRPC.User user3;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c11;
        String j10;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Canvas canvas;
        org.telegram.ui.Components.i9 i9Var2;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        dz dzVar = this.r;
        ArrayList arrayList = dzVar.e;
        int i12 = dzVar.w;
        int i13 = 8;
        int i14 = 2;
        ?? r12 = 1;
        int i15 = 0;
        ViewGroup[] viewGroupArr = this.n;
        if (i12 == 0) {
            int i16 = 0;
            while (i16 < i14) {
                if (arrayList.isEmpty()) {
                    dialog2 = i16 < dzVar.getMessagesController().dialogsServerOnly.size() ? dzVar.getMessagesController().dialogsServerOnly.get(i16) : null;
                    j3 = 0;
                } else if (i16 < arrayList.size()) {
                    j3 = 0;
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) dzVar.getMessagesController().dialogs_dict.f(((Long) arrayList.get(i16)).longValue());
                    if (dialog3 == null) {
                        dialog3 = new TLRPC.TL_dialog();
                        dialog3.id = ((Long) arrayList.get(i16)).longValue();
                    }
                    dialog2 = dialog3;
                } else {
                    j3 = 0;
                    dialog2 = null;
                }
                if (dialog2 == null) {
                    viewGroupArr[i16].setVisibility(i13);
                    i11 = i16;
                } else {
                    viewGroupArr[i16].setVisibility(i15);
                    if (DialogObject.isUserDialog(dialog2.id)) {
                        user2 = dzVar.getMessagesController().getUser(Long.valueOf(dialog2.id));
                        if (user2 != null) {
                            str2 = UserObject.isUserSelf(user2) ? LocaleController.getString(R.string.SavedMessages) : UserObject.isReplyUser(user2) ? LocaleController.getString(R.string.RepliesTitle) : UserObject.isDeleted(user2) ? LocaleController.getString(R.string.HiddenName) : ContactsController.formatName(user2.first_name, user2.last_name);
                            if (UserObject.isReplyUser(user2) || UserObject.isUserSelf(user2) || (userProfilePhoto2 = user2.photo) == null || (fileLocation2 = userProfilePhoto2.photo_small) == null) {
                                i11 = i16;
                            } else {
                                i11 = i16;
                                if (fileLocation2.volume_id != j3 && fileLocation2.local_id != 0) {
                                    chat2 = null;
                                    ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                                    if (fileLocation2 == null) {
                                        try {
                                            decodeFile2 = BitmapFactory.decodeFile(dzVar.getFileLoader().getPathToAttach(fileLocation2, r12).toString());
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c10 = 1;
                                            FileLog.e(th);
                                            ArrayList arrayList2 = (ArrayList) dzVar.getMessagesController().dialogMessage.f(dialog2.id);
                                            if (arrayList2 != null) {
                                            }
                                            if (messageObject == null) {
                                            }
                                            if (dialog2.unread_count <= 0) {
                                            }
                                            i16 = i11 + 1;
                                            i13 = 8;
                                            i14 = 2;
                                            r12 = 1;
                                            i15 = 0;
                                        }
                                    } else {
                                        decodeFile2 = null;
                                    }
                                    int dp = AndroidUtilities.dp(48.0f);
                                    Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
                                    createBitmap.eraseColor(i15);
                                    Canvas canvas2 = new Canvas(createBitmap);
                                    if (decodeFile2 != null) {
                                        if (user2 != null) {
                                            org.telegram.ui.Components.i9 i9Var3 = new org.telegram.ui.Components.i9(i15, user2);
                                            if (UserObject.isReplyUser(user2)) {
                                                i9Var3.g(12);
                                                i9Var2 = i9Var3;
                                            } else {
                                                i9Var2 = i9Var3;
                                                if (UserObject.isUserSelf(user2)) {
                                                    i9Var3.g(r12);
                                                    i9Var2 = i9Var3;
                                                }
                                            }
                                        } else {
                                            i9Var2 = new org.telegram.ui.Components.i9(chat2);
                                        }
                                        i9Var2.setBounds(i15, i15, dp, dp);
                                        i9Var2.draw(canvas2);
                                        canvas = canvas2;
                                        c10 = 1;
                                    } else {
                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                        BitmapShader bitmapShader = new BitmapShader(decodeFile2, tileMode, tileMode);
                                        if (this.f == null) {
                                            this.f = new Paint((int) r12);
                                            this.h = new RectF();
                                        }
                                        float width = dp / decodeFile2.getWidth();
                                        canvas2.save();
                                        canvas2.scale(width, width);
                                        this.f.setShader(bitmapShader);
                                        c10 = 1;
                                        this.h.set(0.0f, 0.0f, decodeFile2.getWidth(), decodeFile2.getHeight());
                                        canvas = canvas2;
                                        canvas.drawRoundRect(this.h, decodeFile2.getWidth(), decodeFile2.getHeight(), this.f);
                                        canvas.restore();
                                    }
                                    canvas.setBitmap(null);
                                    ((ImageView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap);
                                    ArrayList arrayList22 = (ArrayList) dzVar.getMessagesController().dialogMessage.f(dialog2.id);
                                    messageObject = (arrayList22 != null || arrayList22.size() <= 0) ? null : (MessageObject) arrayList22.get(i15);
                                    if (messageObject == null) {
                                        long fromChatId = messageObject.getFromChatId();
                                        if (fromChatId > j3) {
                                            user3 = dzVar.getMessagesController().getUser(Long.valueOf(fromChatId));
                                            chat3 = null;
                                        } else {
                                            chat3 = dzVar.getMessagesController().getChat(Long.valueOf(-fromChatId));
                                            user3 = null;
                                        }
                                        int color = getContext().getResources().getColor(R.color.widget_text);
                                        if (messageObject.messageOwner instanceof TLRPC.TL_messageService) {
                                            if (ChatObject.isChannel(chat2)) {
                                                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                                                charSequence3 = "";
                                                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                                    charSequence3 = "";
                                                }
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                charSequence2 = charSequence3;
                                            }
                                            charSequence3 = messageObject.messageText;
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            charSequence2 = charSequence3;
                                        } else {
                                            String str3 = "📎 ";
                                            if (chat2 == null || chat2.id <= j3 || chat3 != null || (ChatObject.isChannel(chat2) && !ChatObject.isMegagroup(chat2))) {
                                                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                                                if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                                    charSequence2 = LocaleController.getString(R.string.AttachPhotoExpired);
                                                } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                                    charSequence2 = LocaleController.getString(R.string.AttachVideoExpired);
                                                } else if (messageObject.caption != null) {
                                                    if (messageObject.isVideo()) {
                                                        str3 = "📹 ";
                                                    } else if (messageObject.isVoice()) {
                                                        str3 = "🎤 ";
                                                    } else if (messageObject.isMusic()) {
                                                        str3 = "🎧 ";
                                                    } else if (messageObject.isPhoto()) {
                                                        str3 = "🖼 ";
                                                    }
                                                    StringBuilder u10 = a4.a.u(str3);
                                                    u10.append((Object) messageObject.caption);
                                                    charSequence2 = u10.toString();
                                                } else {
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                                        charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                                    } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                                        charSequence = "🎮 " + messageObject.messageOwner.media.game.title;
                                                    } else if (messageObject.type == 14) {
                                                        charSequence = com.google.android.gms.internal.vision.e2.j("🎧 ", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle());
                                                    } else {
                                                        charSequence = messageObject.messageText;
                                                        AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (org.telegram.ui.ActionBar.f6) null);
                                                    }
                                                    CharSequence charSequence4 = charSequence;
                                                    charSequence2 = charSequence4;
                                                    if (messageObject.messageOwner.media != null) {
                                                        charSequence2 = charSequence4;
                                                        if (!messageObject.isMediaEmpty()) {
                                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                                            charSequence2 = charSequence4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                String string = messageObject.isOutOwner() ? LocaleController.getString(R.string.FromYou) : user3 != null ? UserObject.getFirstName(user3).replace("\n", "") : "DELETED";
                                                CharSequence charSequence5 = messageObject.caption;
                                                try {
                                                    if (charSequence5 != null) {
                                                        String charSequence6 = charSequence5.toString();
                                                        if (charSequence6.length() > 150) {
                                                            charSequence6 = charSequence6.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                        }
                                                        if (messageObject.isVideo()) {
                                                            str3 = "📹 ";
                                                        } else if (messageObject.isVoice()) {
                                                            str3 = "🎤 ";
                                                        } else if (messageObject.isMusic()) {
                                                            str3 = "🎧 ";
                                                        } else if (messageObject.isPhoto()) {
                                                            str3 = "🖼 ";
                                                        }
                                                        StringBuilder u11 = a4.a.u(str3);
                                                        u11.append(charSequence6.replace('\n', ' '));
                                                        Object[] objArr = new Object[2];
                                                        objArr[0] = u11.toString();
                                                        objArr[c10] = string;
                                                        valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                                    } else {
                                                        char c12 = '\n';
                                                        if (messageObject.messageOwner.media == null || messageObject.isMediaEmpty()) {
                                                            String str4 = messageObject.messageOwner.message;
                                                            if (str4 != null) {
                                                                if (str4.length() > 150) {
                                                                    c11 = 0;
                                                                    str4 = str4.substring(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                                                                } else {
                                                                    c11 = 0;
                                                                }
                                                                Object[] objArr2 = new Object[2];
                                                                objArr2[c11] = str4.replace('\n', ' ').trim();
                                                                objArr2[c10] = string;
                                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                            } else {
                                                                valueOf = SpannableStringBuilder.valueOf("");
                                                            }
                                                        } else {
                                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                                            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
                                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                                j10 = a4.a.p("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                                j10 = a4.a.p("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                                            } else {
                                                                j10 = messageObject.type == 14 ? org.telegram.ui.Cells.p6.j("🎧 \u2068", messageObject.getMusicAuthor(), " - ", messageObject.getMusicTitle(), "\u2069") : messageObject.messageText.toString();
                                                                c12 = '\n';
                                                            }
                                                            String replace = j10.replace(c12, ' ');
                                                            Object[] objArr3 = new Object[2];
                                                            objArr3[0] = replace;
                                                            objArr3[c10] = string;
                                                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr3));
                                                            try {
                                                                valueOf2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.o9, null), string.length() + 2, valueOf2.length(), 33);
                                                                spannableStringBuilder = valueOf2;
                                                            } catch (Exception e7) {
                                                                FileLog.e(e7);
                                                                spannableStringBuilder = valueOf2;
                                                            }
                                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.k9, null), 0, string.length() + 1, 33);
                                                            charSequence2 = spannableStringBuilder;
                                                        }
                                                    }
                                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.k9, null), 0, string.length() + 1, 33);
                                                    charSequence2 = spannableStringBuilder;
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                    charSequence2 = spannableStringBuilder;
                                                }
                                                spannableStringBuilder = valueOf;
                                            }
                                        }
                                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(messageObject.messageOwner.date));
                                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_message)).setText(charSequence2.toString());
                                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_message)).setTextColor(color);
                                    } else {
                                        if (dialog2.last_message_date != 0) {
                                            ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_time)).setText(LocaleController.stringForMessageListDate(dialog2.last_message_date));
                                        } else {
                                            ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_time)).setText("");
                                        }
                                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_message)).setText("");
                                    }
                                    if (dialog2.unread_count <= 0) {
                                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_badge)).setText(String.format("%d", Integer.valueOf(dialog2.unread_count)));
                                        viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_badge).setVisibility(0);
                                        if (dzVar.getMessagesController().isDialogMuted(dialog2.id, j3)) {
                                            viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter_muted);
                                        } else {
                                            viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter);
                                        }
                                    } else {
                                        viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                                    }
                                }
                            }
                        } else {
                            i11 = i16;
                            str2 = "";
                        }
                        chat2 = null;
                        fileLocation2 = null;
                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                        if (fileLocation2 == null) {
                        }
                        int dp2 = AndroidUtilities.dp(48.0f);
                        Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                        createBitmap2.eraseColor(i15);
                        Canvas canvas22 = new Canvas(createBitmap2);
                        if (decodeFile2 != null) {
                        }
                        canvas.setBitmap(null);
                        ((ImageView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap2);
                        ArrayList arrayList222 = (ArrayList) dzVar.getMessagesController().dialogMessage.f(dialog2.id);
                        if (arrayList222 != null) {
                        }
                        if (messageObject == null) {
                        }
                        if (dialog2.unread_count <= 0) {
                        }
                    } else {
                        i11 = i16;
                        TLRPC.Chat chat4 = dzVar.getMessagesController().getChat(Long.valueOf(-dialog2.id));
                        if (chat4 != null) {
                            str2 = chat4.title;
                            TLRPC.ChatPhoto chatPhoto = chat4.photo;
                            if (chatPhoto == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == j3 || fileLocation2.local_id == 0) {
                                chat2 = chat4;
                            } else {
                                chat2 = chat4;
                                user2 = null;
                                ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                                if (fileLocation2 == null) {
                                }
                                int dp22 = AndroidUtilities.dp(48.0f);
                                Bitmap createBitmap22 = Bitmap.createBitmap(dp22, dp22, Bitmap.Config.ARGB_8888);
                                createBitmap22.eraseColor(i15);
                                Canvas canvas222 = new Canvas(createBitmap22);
                                if (decodeFile2 != null) {
                                }
                                canvas.setBitmap(null);
                                ((ImageView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap22);
                                ArrayList arrayList2222 = (ArrayList) dzVar.getMessagesController().dialogMessage.f(dialog2.id);
                                if (arrayList2222 != null) {
                                }
                                if (messageObject == null) {
                                }
                                if (dialog2.unread_count <= 0) {
                                }
                            }
                        } else {
                            chat2 = chat4;
                            str2 = "";
                        }
                        user2 = null;
                        fileLocation2 = null;
                        ((TextView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                        if (fileLocation2 == null) {
                        }
                        int dp222 = AndroidUtilities.dp(48.0f);
                        Bitmap createBitmap222 = Bitmap.createBitmap(dp222, dp222, Bitmap.Config.ARGB_8888);
                        createBitmap222.eraseColor(i15);
                        Canvas canvas2222 = new Canvas(createBitmap222);
                        if (decodeFile2 != null) {
                        }
                        canvas.setBitmap(null);
                        ((ImageView) viewGroupArr[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap222);
                        ArrayList arrayList22222 = (ArrayList) dzVar.getMessagesController().dialogMessage.f(dialog2.id);
                        if (arrayList22222 != null) {
                        }
                        if (messageObject == null) {
                        }
                        if (dialog2.unread_count <= 0) {
                        }
                    }
                }
                i16 = i11 + 1;
                i13 = 8;
                i14 = 2;
                r12 = 1;
                i15 = 0;
            }
            viewGroupArr[0].findViewById(R.id.shortcut_widget_item_divider).setVisibility(viewGroupArr[1].getVisibility());
            viewGroupArr[1].findViewById(R.id.shortcut_widget_item_divider).setVisibility(8);
        } else if (i12 == 1) {
            int i17 = 0;
            while (true) {
                if (i17 >= 2) {
                    break;
                }
                int i18 = 0;
                for (int i19 = 2; i18 < i19; i19 = 2) {
                    int i20 = (i17 * 2) + i18;
                    if (arrayList.isEmpty()) {
                        if (i20 < dzVar.getMediaDataController().hints.size()) {
                            long j11 = dzVar.getMediaDataController().hints.get(i20).peer.user_id;
                            dialog = (TLRPC.Dialog) dzVar.getMessagesController().dialogs_dict.f(j11);
                            if (dialog == null) {
                                dialog = new TLRPC.TL_dialog();
                                dialog.id = j11;
                            }
                        }
                        dialog = null;
                    } else {
                        if (i20 < arrayList.size()) {
                            dialog = (TLRPC.Dialog) dzVar.getMessagesController().dialogs_dict.f(((Long) arrayList.get(i20)).longValue());
                            if (dialog == null) {
                                dialog = new TLRPC.TL_dialog();
                                dialog.id = ((Long) arrayList.get(i20)).longValue();
                            }
                        }
                        dialog = null;
                    }
                    if (dialog == null) {
                        viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(4);
                        if (i20 == 0 || i20 == 2) {
                            viewGroupArr[i17].setVisibility(8);
                        }
                    } else {
                        viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2).setVisibility(0);
                        if (i20 == 0 || i20 == 2) {
                            viewGroupArr[i17].setVisibility(0);
                        }
                        if (DialogObject.isUserDialog(dialog.id)) {
                            user = dzVar.getMessagesController().getUser(Long.valueOf(dialog.id));
                            String string2 = UserObject.isUserSelf(user) ? LocaleController.getString(R.string.SavedMessages) : UserObject.isReplyUser(user) ? LocaleController.getString(R.string.RepliesTitle) : UserObject.isDeleted(user) ? LocaleController.getString(R.string.HiddenName) : UserObject.getFirstName(user);
                            if (UserObject.isReplyUser(user) || UserObject.isUserSelf(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                str = string2;
                                chat = null;
                                fileLocation = null;
                            } else {
                                str = string2;
                                chat = null;
                            }
                        } else {
                            TLRPC.Chat chat5 = dzVar.getMessagesController().getChat(Long.valueOf(-dialog.id));
                            String str5 = chat5.title;
                            TLRPC.ChatPhoto chatPhoto2 = chat5.photo;
                            if (chatPhoto2 != null && (fileLocation = chatPhoto2.photo_small) != null) {
                                if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                    str = str5;
                                    chat = chat5;
                                    user = null;
                                }
                            }
                            str = str5;
                            fileLocation = null;
                            chat = chat5;
                            user = null;
                        }
                        ((TextView) viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                        if (fileLocation != null) {
                            try {
                                decodeFile = BitmapFactory.decodeFile(dzVar.getFileLoader().getPathToAttach(fileLocation, true).toString());
                            } catch (Throwable th3) {
                                th = th3;
                                FileLog.e(th);
                                i10 = dialog.unread_count;
                                if (i10 > 0) {
                                }
                                i18++;
                            }
                        } else {
                            decodeFile = null;
                        }
                        int dp3 = AndroidUtilities.dp(48.0f);
                        Bitmap createBitmap3 = Bitmap.createBitmap(dp3, dp3, Bitmap.Config.ARGB_8888);
                        createBitmap3.eraseColor(0);
                        Canvas canvas3 = new Canvas(createBitmap3);
                        if (decodeFile == null) {
                            if (user != null) {
                                try {
                                    i9Var = new org.telegram.ui.Components.i9(0, user);
                                    if (UserObject.isReplyUser(user)) {
                                        try {
                                            i9Var.g(12);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            FileLog.e(th);
                                            i10 = dialog.unread_count;
                                            if (i10 > 0) {
                                            }
                                            i18++;
                                        }
                                    } else if (UserObject.isUserSelf(user)) {
                                        i9Var.g(1);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                i9Var = new org.telegram.ui.Components.i9(chat);
                            }
                            i9Var.setBounds(0, 0, dp3, dp3);
                            i9Var.draw(canvas3);
                        } else {
                            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader2 = new BitmapShader(decodeFile, tileMode2, tileMode2);
                            float width2 = dp3 / decodeFile.getWidth();
                            canvas3.save();
                            canvas3.scale(width2, width2);
                            this.f.setShader(bitmapShader2);
                            try {
                                this.h.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                canvas3.drawRoundRect(this.h, decodeFile.getWidth(), decodeFile.getHeight(), this.f);
                                canvas3.restore();
                            } catch (Throwable th6) {
                                th = th6;
                                FileLog.e(th);
                                i10 = dialog.unread_count;
                                if (i10 > 0) {
                                }
                                i18++;
                            }
                        }
                        try {
                            canvas3.setBitmap(null);
                            ((ImageView) viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap3);
                        } catch (Throwable th7) {
                            th = th7;
                            FileLog.e(th);
                            i10 = dialog.unread_count;
                            if (i10 > 0) {
                            }
                            i18++;
                        }
                        i10 = dialog.unread_count;
                        if (i10 > 0) {
                            ((TextView) viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(i10 > 99 ? String.format("%d+", 99) : String.format("%d", Integer.valueOf(i10)));
                            viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2).setVisibility(0);
                        } else {
                            viewGroupArr[i17].findViewById(i18 == 0 ? R.id.contacts_widget_item_badge_bg1 : R.id.contacts_widget_item_badge_bg2).setVisibility(8);
                        }
                    }
                    i18++;
                }
                i17++;
            }
        }
        if (viewGroupArr[0].getVisibility() == 0) {
            dzVar.d.setVisibility(8);
        } else {
            dzVar.d.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.v9 v9Var = this.a;
        if (v9Var != null) {
            v9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.v9 v9Var2 = this.b;
        if (v9Var2 != null) {
            v9Var2.dispose();
            this.b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.Components.v9 v9Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        Drawable drawable = this.c;
        if (s02 != drawable && s02 != null) {
            if (org.telegram.ui.ActionBar.j6.sl != null) {
                this.d = drawable;
                this.b = this.a;
            } else {
                org.telegram.ui.Components.v9 v9Var2 = this.a;
                if (v9Var2 != null) {
                    v9Var2.dispose();
                    this.a = null;
                }
            }
            this.c = s02;
        }
        dz dzVar = this.r;
        d5Var = ((org.telegram.ui.ActionBar.n2) dzVar).parentLayout;
        float themeAnimationValue = d5Var.getThemeAnimationValue();
        int i10 = 0;
        while (i10 < 2) {
            Drawable drawable2 = i10 == 0 ? this.d : this.c;
            if (drawable2 != null) {
                if (i10 == 1 && this.d != null) {
                    d5Var2 = ((org.telegram.ui.ActionBar.n2) dzVar).parentLayout;
                    if (d5Var2 != null) {
                        drawable2.setAlpha((int) (255.0f * themeAnimationValue));
                        if (!(drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof org.telegram.ui.Components.dc0)) {
                            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            if (drawable2 instanceof org.telegram.ui.Components.w9) {
                                drawable2.draw(canvas);
                            } else {
                                this.a = ((org.telegram.ui.Components.w9) drawable2).c(canvas, this);
                            }
                        } else if (drawable2 instanceof BitmapDrawable) {
                            if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f7 = 2.0f / AndroidUtilities.density;
                                canvas.scale(f7, f7);
                                drawable2.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable2.getIntrinsicWidth(), measuredHeight / drawable2.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable2.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable2.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i11 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable2.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                            }
                            drawable2.draw(canvas);
                            canvas.restore();
                        }
                        if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                            v9Var = this.b;
                            if (v9Var != null) {
                                v9Var.dispose();
                                this.b = null;
                            }
                            this.d = null;
                            invalidate();
                        }
                    }
                }
                drawable2.setAlpha(255);
                if (drawable2 instanceof ColorDrawable) {
                }
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (drawable2 instanceof org.telegram.ui.Components.w9) {
                }
                if (i10 == 0) {
                    v9Var = this.b;
                    if (v9Var != null) {
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i10++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.e;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
