package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class yn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ yn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = tLObject;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                qp qpVar = (qp) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                qr qrVar = (qr) this.e;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                qpVar.getClass();
                if (tL_error != null) {
                    g0.h3(new gn(qpVar, qrVar, context, u1Var, tL_error, f2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        g0.h3(new fn(1, context, u1Var));
                    }
                    qpVar.O3((TLRPC.Updates) tLObject, false);
                    g0.h3(new a(qrVar, 27));
                    break;
                }
            default:
                final f10 f10Var = (f10) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final d10 d10Var = (d10) this.e;
                final bi.r3 r3Var = (bi.r3) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                f10Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i7 = 1;
                    g0.h3(new Runnable() { // from class: org.telegram.messenger.u00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    f10 f10Var2 = f10Var;
                                    f10Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    f10Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                    f10Var2.J.remove(d10Var);
                                    r3Var.run();
                                    break;
                                default:
                                    f10 f10Var3 = f10Var;
                                    f10Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    f10Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                    f10Var3.J.remove(d10Var);
                                    r3Var.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.h3(new gn(f10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), d10Var, r3Var, 4));
                        break;
                    } else {
                        final int i10 = 0;
                        g0.h3(new Runnable() { // from class: org.telegram.messenger.u00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        f10 f10Var2 = f10Var;
                                        f10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        f10Var2.getMessagesController().P1().k.h(storyItem2.dialogId, storyItem2);
                                        f10Var2.J.remove(d10Var);
                                        r3Var.run();
                                        break;
                                    default:
                                        f10 f10Var3 = f10Var;
                                        f10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        f10Var3.getMessagesController().P1().k.h(storyItem3.dialogId, storyItem3);
                                        f10Var3.J.remove(d10Var);
                                        r3Var.run();
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
        }
    }
}
