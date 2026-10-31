package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class co implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject g;

    public /* synthetic */ co(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = f1Var;
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
                vp vpVar = (vp) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.d;
                zr zrVar = (zr) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f;
                TLRPC.TL_channels_convertToGigagroup tL_channels_convertToGigagroup = (TLRPC.TL_channels_convertToGigagroup) this.g;
                vpVar.getClass();
                if (tL_error != null) {
                    i0.g3(new gn(vpVar, zrVar, context, x1Var, tL_error, k2Var, tL_channels_convertToGigagroup, 1));
                    break;
                } else {
                    if (context != null) {
                        i0.g3(new fn(1, context, x1Var));
                    }
                    vpVar.L3((TLRPC.Updates) tLObject, false);
                    i0.g3(new a(zrVar, 27));
                    break;
                }
            default:
                final t10 t10Var = (t10) this.b;
                final TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.c;
                final String str = (String) this.d;
                final r10 r10Var = (r10) this.e;
                final bi.e eVar = (bi.e) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.g;
                t10Var.getClass();
                if (!(tLObject instanceof TLRPC.TL_messages_translateResult)) {
                    final int i10 = 1;
                    i0.g3(new Runnable() { // from class: org.telegram.messenger.i10
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    t10 t10Var2 = t10Var;
                                    t10Var2.getClass();
                                    TL_stories.StoryItem storyItem2 = storyItem;
                                    storyItem2.translatedLng = str;
                                    storyItem2.translatedText = null;
                                    t10Var2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                    t10Var2.J.remove(r10Var);
                                    eVar.run();
                                    break;
                                default:
                                    t10 t10Var3 = t10Var;
                                    t10Var3.getClass();
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    storyItem3.translatedLng = str;
                                    storyItem3.translatedText = null;
                                    t10Var3.getMessagesController().O1().k.h(storyItem3.dialogId, storyItem3);
                                    t10Var3.J.remove(r10Var);
                                    eVar.run();
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ArrayList<TLRPC.TL_textWithEntities> arrayList = ((TLRPC.TL_messages_translateResult) tLObject).result;
                    if (arrayList.size() > 0) {
                        i0.g3(new gn(t10Var, storyItem, str, tL_textWithEntities, arrayList.get(0), r10Var, eVar, 4));
                        break;
                    } else {
                        final int i11 = 0;
                        i0.g3(new Runnable() { // from class: org.telegram.messenger.i10
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        t10 t10Var2 = t10Var;
                                        t10Var2.getClass();
                                        TL_stories.StoryItem storyItem2 = storyItem;
                                        storyItem2.translatedLng = str;
                                        storyItem2.translatedText = null;
                                        t10Var2.getMessagesController().O1().k.h(storyItem2.dialogId, storyItem2);
                                        t10Var2.J.remove(r10Var);
                                        eVar.run();
                                        break;
                                    default:
                                        t10 t10Var3 = t10Var;
                                        t10Var3.getClass();
                                        TL_stories.StoryItem storyItem3 = storyItem;
                                        storyItem3.translatedLng = str;
                                        storyItem3.translatedText = null;
                                        t10Var3.getMessagesController().O1().k.h(storyItem3.dialogId, storyItem3);
                                        t10Var3.J.remove(r10Var);
                                        eVar.run();
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
