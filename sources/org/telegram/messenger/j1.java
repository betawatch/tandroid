package org.telegram.messenger;

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(Object obj, Collator collator, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$buildContactsSectionsArrays$43;
        int lambda$processLoadedContacts$30;
        switch (this.a) {
            case 0:
                lambda$buildContactsSectionsArrays$43 = ((ContactsController) this.c).lambda$buildContactsSectionsArrays$43(this.b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$buildContactsSectionsArrays$43;
            default:
                lambda$processLoadedContacts$30 = ContactsController.lambda$processLoadedContacts$30((a0.i) this.c, this.b, (TLRPC.TL_contact) obj, (TLRPC.TL_contact) obj2);
                return lambda$processLoadedContacts$30;
        }
    }
}
