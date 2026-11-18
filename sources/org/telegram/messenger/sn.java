package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ sn(c1 c1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i7) {
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
                mp mpVar = (mp) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                lr lrVar = (lr) this.e;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                mpVar.getClass();
                if (tL_error != null) {
                    g0.g3(new wm(mpVar, lrVar, context, u1Var, tL_error, h2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        g0.g3(new vm(1, context, u1Var));
                    }
                    mpVar.V3((TLRPC.Updates) tLObject, false);
                    g0.g3(new a(lrVar, 27));
                    break;
                }
            default:
                final z00 z00Var = (z00) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final x00 x00Var = (x00) this.e;
                final bi.y3 y3Var = (bi.y3) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                z00Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i7 = 1;
                    g0.g3(new Runnable() { // from class: org.telegram.messenger.o00
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    z00 z00Var2 = z00Var;
                                    z00Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    z00Var2.getMessagesController().R1().k.h(storyItem2.dialogId, storyItem2);
                                    z00Var2.K.remove(x00Var);
                                    y3Var.run();
                                    break;
                                default:
                                    z00 z00Var3 = z00Var;
                                    z00Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    z00Var3.getMessagesController().R1().k.h(storyItem3.dialogId, storyItem3);
                                    z00Var3.K.remove(x00Var);
                                    y3Var.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        g0.g3(new wm(z00Var, storyItem, str, tL_textWithEntities, arrayList.get(0), x00Var, y3Var, 4));
                        break;
                    } else {
                        final int i10 = 0;
                        g0.g3(new Runnable() { // from class: org.telegram.messenger.o00
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        z00 z00Var2 = z00Var;
                                        z00Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        z00Var2.getMessagesController().R1().k.h(storyItem2.dialogId, storyItem2);
                                        z00Var2.K.remove(x00Var);
                                        y3Var.run();
                                        break;
                                    default:
                                        z00 z00Var3 = z00Var;
                                        z00Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        z00Var3.getMessagesController().R1().k.h(storyItem3.dialogId, storyItem3);
                                        z00Var3.K.remove(x00Var);
                                        y3Var.run();
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
