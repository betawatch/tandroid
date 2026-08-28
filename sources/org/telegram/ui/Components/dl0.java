package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final b5 E;
    public final b5 F;
    public final b5 G;
    public final b5 H;
    public final b5 I;
    public final y5 J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public cl0[] W;
    public float X;
    public boolean Y;
    public p80 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public i5 t;
    public i5 u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;
    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f = new Path();
    public final Paint g = new Paint();
    public int q = 0;
    public float r = 1.0f;

    public dl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new af.b(this, 12));
        }
        gr grVar = gr.h;
        this.E = new b5(view, 400L, grVar, 0);
        this.F = new b5(view, 400L, grVar, 0);
        this.G = new b5(view, 400L, grVar, 0);
        this.H = new b5(view, 400L, grVar, 0);
        this.I = new b5(view, 400L, grVar, 0);
        this.J = new y5(view, 0L, 400L, grVar);
        this.K = new y5(view, 0L, 400L, grVar);
        this.L = new y5(view, 0L, 440L, grVar);
        this.M = new y5(view, 0L, 320L, grVar);
        this.N = new y5(view, 0L, 320L, grVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        b5 b5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i10;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        boolean z10;
        View view;
        TLRPC.Message message4;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        if (messageObject != null && !messageObject.isOutOwner() && i9 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, b6Var);
        }
        this.R = false;
        this.v = 0L;
        this.w = 0L;
        this.s = messageObject != null && messageObject.isSponsored();
        b5 b5Var2 = this.I;
        if (messageObject == null) {
            this.j = false;
            this.i = false;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Uc, b6Var);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.x = org.telegram.ui.ActionBar.f6.l1(a2 ? 0.12f : 0.1f, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wc, b6Var);
            this.y = v03;
            return b5Var2.a(v03, false);
        }
        if (i9 != 4 || (message4 = messageObject.messageOwner) == null || MessageObject.getMedia(message4) == null || !(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            b5Var = b5Var2;
            if (i9 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user2 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i12 = messageObject.overrideLinkColor;
                if (i12 < 0) {
                    if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i10 = peerColor.color) == -1) {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i9 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor3 = chat2.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, b6Var);
                                    }
                                }
                                i12 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                                if (i9 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i9 != 2 && user3 != null) {
                                    TLRPC.PeerColor peerColor4 = user3.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, b6Var);
                                    }
                                }
                                i12 = user3 != null ? UserObject.getColorId(user3) : 5;
                                if (i9 == 3) {
                                    this.v = UserObject.getEmojiId(user3);
                                }
                            }
                        } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && user2 != null) {
                            TLRPC.User currentUser = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : user2;
                            if (currentUser != null) {
                                user2 = currentUser;
                            }
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, b6Var);
                                }
                            }
                            i12 = UserObject.getColorId(user2);
                            if (i9 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (messageObject.isFromUser() && user2 != null) {
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, b6Var);
                                }
                            }
                            i12 = UserObject.getColorId(user2);
                            if (i9 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (!messageObject.isFromChannel() || chat == null) {
                            i12 = 0;
                        } else {
                            if (!messageObject.isOutOwner() && i9 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, b6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user4);
                                    if (i9 == 3) {
                                        this.v = UserObject.getEmojiId(user4);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i9 == 3) {
                                        this.v = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                i12 = colorId;
                            } else {
                                i12 = ChatObject.getColorId(chat);
                                if (i9 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        }
                    } else {
                        if (i9 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                        i12 = i10;
                    }
                }
                m(messageObject, i12, b6Var);
                this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.z);
                this.y = this.z;
            } else if (i9 != 0 || (messageObject.overrideLinkColor < 0 && ((message = messageObject.messageOwner) == null || messageObject.replyMessageObject == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) == null || message2.from_id == null || !(messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                this.i = false;
                this.j = false;
                int v04 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Uc, b6Var);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, v04);
                this.y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Wc, b6Var);
            } else {
                int i13 = messageObject.overrideLinkColor;
                if (i13 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            user2 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (user2 != null) {
                            i13 = UserObject.getColorId(user2);
                            this.v = UserObject.getEmojiId(user2);
                        }
                        i13 = 0;
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i9 != 2 && user5 != null) {
                            TLRPC.PeerColor peerColor8 = user5.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, b6Var);
                            }
                        }
                        if (user5 != null) {
                            i13 = UserObject.getColorId(user5);
                            this.v = UserObject.getEmojiId(user5);
                        }
                        i13 = 0;
                    } else {
                        if (messageObject.replyMessageObject.isFromChannel()) {
                            TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                            if (!messageObject.isOutOwner() && i9 != 2 && chat4 != null) {
                                TLRPC.PeerColor peerColor9 = chat4.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, b6Var);
                                }
                            }
                            if (chat4 != null) {
                                i13 = ChatObject.getColorId(chat4);
                                this.v = ChatObject.getEmojiId(chat4);
                            }
                        }
                        i13 = 0;
                    }
                }
                m(messageObject.replyMessageObject, i13, b6Var);
                this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user6 = j10 != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10)) : null;
            if (!messageObject.isOutOwner() && i9 != 2 && user6 != null) {
                TLRPC.PeerColor peerColor10 = user6.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, b6Var);
                }
            }
            if (user6 != null) {
                i11 = UserObject.getColorId(user6);
                b5Var = b5Var2;
                this.v = UserObject.getEmojiId(user6);
            } else {
                b5Var = b5Var2;
                i11 = 0;
            }
            m(messageObject, i11, b6Var);
            this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, this.z);
            this.y = this.z;
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xc, b6Var);
        } else if (messageObject.isOutOwner() || i9 == 2) {
            if (i9 != 2 || messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.f6.v0((this.i || this.j) ? org.telegram.ui.ActionBar.f6.bb : org.telegram.ui.ActionBar.f6.ab, b6Var);
                this.B = v05;
                this.A = v05;
                this.z = v05;
            } else {
                int v06 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pk, b6Var);
                this.B = v06;
                this.A = v06;
                this.z = v06;
            }
            if (this.j) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.f6.l1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.f6.l1(0.5f, this.A);
            } else if (this.i) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.f6.l1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.f6.l1(a2 ? 0.12f : 0.1f, this.B);
            this.y = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cb, b6Var);
        }
        if (i9 == 0 || i9 == 3 || i9 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.t.a();
            }
        }
        i5 i5Var = this.t;
        if (i5Var != null) {
            z10 = true;
            if (i5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z10 = true;
        }
        i5 i5Var2 = this.u;
        if (i5Var2 != null) {
            i5Var2.j(this.w, z10);
        }
        this.C = h();
        return b5Var.a(this.y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        c(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        d(canvas, rectF, f13, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, boolean z10, boolean z11) {
        boolean z12;
        ih.z2 z2Var;
        float e10;
        i5 i5Var;
        if (!z11) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(f10, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(l1);
            float[] fArr = this.e;
            if (ff.m0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        i5 i5Var2 = this.t;
        if (i5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = i5Var2.f[0];
                if ((drawable instanceof k5) && (z2Var = ((k5) drawable).k) != null && z2Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e10 = this.L.e(z12);
                    if (e10 > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.W == null) {
                        this.W = new cl0[]{new cl0(4.0f, -6.33f, 1.0f, 1.0f), new cl0(30.0f, 3.0f, 0.78f, 0.9f), new cl0(46.0f, -17.0f, 0.6f, 0.6f), new cl0(69.66f, -0.666f, 0.87f, 0.7f), new cl0(98.0f, -12.6f, 1.03f, 0.3f), new cl0(51.0f, 24.0f, 1.0f, 0.5f), new cl0(6.33f, 20.0f, 0.77f, 0.7f), new cl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new cl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.X);
                    float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                    if (z10) {
                        max -= AndroidUtilities.dp(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                    i5 i5Var3 = this.u;
                    if (i5Var3 != null) {
                        i5Var3.v = (int) (f10 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i9 = 0;
                    while (true) {
                        cl0[] cl0VarArr = this.W;
                        if (i9 >= cl0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i9 != 0 || (i5Var = this.u) == null || this.w == 0) {
                            i5Var = this.t;
                        }
                        cl0 cl0Var = cl0VarArr[i9];
                        if (!cl0Var.e || z10) {
                            i5Var.v = (int) ((i5Var == this.u ? 1.0f : 0.3f) * 255.0f * cl0Var.d * this.r);
                            float dp = max - AndroidUtilities.dp(cl0Var.a);
                            float dp2 = AndroidUtilities.dp(cl0Var.b) + min;
                            float dp3 = AndroidUtilities.dp(10.0f) * cl0Var.c * e10;
                            i5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                            i5Var.draw(canvas);
                        }
                        i9++;
                    }
                }
            }
            z12 = true;
            e10 = this.L.e(z12);
            if (e10 > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0251, code lost:
    
        if (r26.k.getHeight() == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float height;
        int i9;
        int i10;
        float f12;
        int floor = (int) Math.floor(SharedConfig.bubbleRadius / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(floor * 2));
        int a2 = this.F.a(this.z, false);
        int l1 = org.telegram.ui.ActionBar.f6.l1(f10, a2);
        Paint paint = this.b;
        paint.setColor(l1);
        float e10 = this.M.e(this.S);
        float e11 = this.J.e(this.i);
        float e12 = this.K.e(this.j);
        RectF rectF2 = this.a;
        if (e10 > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f13 = rectF2.left;
            canvas.clipRect(f13, rectF2.top, AndroidUtilities.dp(3.0f) + f13, rectF2.bottom);
            float f14 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.T / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (AndroidUtilities.lerp(0.0f, 1.0f - gr.i.getInterpolation(g7.n.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), e10) * rectF.height()) + rectF.top, rectF.left + AndroidUtilities.dp(6.0f), (AndroidUtilities.lerp(1.0f, 1.0f - gr.g.getInterpolation(g7.n.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), e10) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (e11 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f15 = rectF2.left;
            canvas.clipRect(f15, rectF2.top, AndroidUtilities.dp(3.0f) + f15, rectF2.bottom);
            float f16 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.j) {
            height = rectF.height();
            f11 = 12.66f;
            int height2 = (int) rectF.height();
            int dp = AndroidUtilities.dp(18.99f);
            i9 = height2 % dp;
            if (i9 != 0) {
                if ((((height2 ^ dp) >> 31) | 1) <= 0) {
                    i9 += dp;
                }
                i10 = i9;
            }
            i10 = 0;
        } else {
            f11 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            int dp2 = AndroidUtilities.dp(12.66f);
            i9 = height3 % dp2;
            if (i9 != 0) {
                if ((((height3 ^ dp2) >> 31) | 1) <= 0) {
                    i9 += dp2;
                }
                i10 = i9;
            }
            i10 = 0;
        }
        float d = ((((this.N.d(this.q * 425, false) + this.U) + (this.R ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (height - i10);
        int a3 = this.G.a(this.A, false);
        int a10 = this.H.a(this.B, false);
        int l12 = org.telegram.ui.ActionBar.f6.l1(f10, a2);
        int h = i0.a.h(org.telegram.ui.ActionBar.f6.l1(e11 * f10, a3), l12);
        int h10 = this.j ? i0.a.h(org.telegram.ui.ActionBar.f6.l1(f10 * e12, a10), l12) : 0;
        int round = Math.round(AndroidUtilities.dpf2(6.33f));
        int max2 = Math.max(1, AndroidUtilities.dp(3.0f));
        int dp3 = this.j ? AndroidUtilities.dp(18.99f) : AndroidUtilities.dp(f11);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == l12 && this.m == h && this.n == h10) {
            f12 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f12 = max;
        }
        this.l = l12;
        this.m = h;
        this.n = h10;
        this.p = this.j;
        this.o = round;
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.getWidth() != max2 || this.k.getHeight() != dp3) {
            Bitmap bitmap3 = this.k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.k = Bitmap.createBitmap(max2, dp3, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.k, l12, h, h10, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -d);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(255);
        rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
        float f17 = rectF2.left;
        canvas.clipRect(f17, rectF2.top, AndroidUtilities.dp(3.0f) + f17, rectF2.bottom);
        float f18 = floor;
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        p80 p80Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.S && ((p80Var = this.h) == null || !p80Var.c())) {
            p80 p80Var2 = this.h;
            if (p80Var2 != null) {
                p80Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            p80 p80Var3 = new p80();
            this.h = p80Var3;
            p80Var3.C = true;
            p80Var3.t = 3.5f;
            p80Var3.u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.f6.l1(0.1f, this.z), org.telegram.ui.ActionBar.f6.l1(0.3f, this.z), org.telegram.ui.ActionBar.f6.l1(0.3f, this.z), org.telegram.ui.ActionBar.f6.l1(1.25f, this.z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.x;
    }

    public final int h() {
        return this.R ? this.A : this.z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e10 = this.M.e(this.S);
        this.T = (Math.min(30L, currentTimeMillis - this.V) * e10) + this.T;
        this.U = (Math.min(30L, currentTimeMillis - this.V) * e10) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f10) {
        this.X = f10;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        i5 i5Var = this.t;
        if (i5Var != null) {
            i5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.b6 b6Var) {
        boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
        int i9 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a2 || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = id2;
        }
        this.R = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z10 = arrayList.size() >= 2;
        this.i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z11 = arrayList.size() >= 3;
        this.j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i10 = i9 | (-16777216);
        this.y = i10;
        this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, i10);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.t == null && view != null) {
            this.t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.t.a();
            }
        }
        i5 i5Var = this.t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.u.a();
            }
        }
        i5 i5Var2 = this.u;
        if (i5Var2 != null) {
            i5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(MessageObject messageObject, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        if (b6Var != null) {
            b6Var.a();
        } else {
            org.telegram.ui.ActionBar.f6.e1();
        }
        if (this.P != i9) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i9;
            this.O = id2;
        }
        if (i9 < 7) {
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.r8[i9], b6Var);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i9) : null;
        if (color == null) {
            int v03 = org.telegram.ui.ActionBar.f6.v0((messageObject == null || !messageObject.isOutOwner()) ? org.telegram.ui.ActionBar.f6.Uc : org.telegram.ui.ActionBar.f6.ab, b6Var);
            this.B = v03;
            this.A = v03;
            this.z = v03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = color.getColor(0, b6Var);
        this.A = color.getColor(1, b6Var);
        int color2 = color.getColor(2, b6Var);
        this.B = color2;
        int i10 = this.A;
        int i11 = this.z;
        this.i = i10 != i11;
        boolean z10 = color2 != i11;
        this.j = z10;
        if (z10) {
            this.B = i10;
            this.A = color2;
        }
    }

    public final void n(float f10) {
        this.r = f10;
    }

    public final int o(org.telegram.ui.ActionBar.b6 b6Var) {
        View view;
        int i9 = org.telegram.ui.ActionBar.f6.q7;
        this.y = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.z = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new i5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.t1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.t1) view).I0) {
                this.t.a();
            }
        }
        i5 i5Var = this.t;
        if (i5Var != null && i5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void p(boolean z10) {
        p80 p80Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            p80 p80Var2 = this.h;
            if (p80Var2 != null) {
                p80Var2.a();
            }
        } else if (z10 && !this.S && (p80Var = this.h) != null) {
            p80Var.c = -1L;
            p80Var.b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i9, boolean z10) {
        this.R = false;
        this.j = false;
        this.i = false;
        this.B = i9;
        this.A = i9;
        this.z = i9;
        this.x = org.telegram.ui.ActionBar.f6.l1(z10 ? 0.12f : 0.1f, i9);
        this.C = i9;
    }
}
