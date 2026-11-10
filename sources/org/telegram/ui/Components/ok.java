package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk b;

    public /* synthetic */ ok(vk vkVar, int i7) {
        this.a = i7;
        this.b = vkVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                vk.Z(this.b, (org.telegram.messenger.fa) obj);
                break;
            default:
                vk.W(this.b, (Location) obj);
                break;
        }
    }
}
