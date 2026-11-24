// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ca2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa2 b;

    public /* synthetic */ ca2(qa2 qa2Var, byte b) {
        this.a = b;
        this.b = qa2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qa2 qa2Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gm.c3(new da2(qa2Var, (byte) 3));
                    break;
                }
                break;
            case 1:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: fa2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        qa2 qa2Var2 = qa2Var;
                        byte b4 = 0;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList = qa2Var2.g0;
                                qa2Var2.e0 = false;
                                if (tLObject2 != null && qa2Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        qa2Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        jb jbVar = new jb(qa2Var2.getParentActivity(), new ga2(qa2Var2, b4), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        jbVar.a(chat, z);
                                        arrayList.add(jbVar);
                                        qa2Var2.y.addView(jbVar, qoe.o(-1, 72));
                                    }
                                    qa2Var2.h0();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < qa2Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = qa2Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                qa2Var2.t0 = false;
                                gm.c3(new da2(qa2Var2, (byte) 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: fa2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        qa2 qa2Var2 = qa2Var;
                        byte b4 = 0;
                        switch (b32) {
                            case 0:
                                ArrayList arrayList = qa2Var2.g0;
                                qa2Var2.e0 = false;
                                if (tLObject2 != null && qa2Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        qa2Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        jb jbVar = new jb(qa2Var2.getParentActivity(), new ga2(qa2Var2, b4), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        jbVar.a(chat, z);
                                        arrayList.add(jbVar);
                                        qa2Var2.y.addView(jbVar, qoe.o(-1, 72));
                                    }
                                    qa2Var2.h0();
                                    break;
                                }
                                break;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < qa2Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = qa2Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                qa2Var2.t0 = false;
                                gm.c3(new da2(qa2Var2, (byte) 4));
                                break;
                        }
                    }
                });
                break;
            default:
                gm.c3(new lx1(qa2Var, tL_error, (byte) 29));
                break;
        }
    }
}
