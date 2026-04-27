package io.noties.markwon;

/* loaded from: classes3.dex */
public interface MarkwonPlugin {

    public interface Registry {
        MarkwonPlugin require(Class cls);
    }
}
