package io.noties.markwon.html;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface HtmlTag {

    public interface Block extends HtmlTag {
        List children();
    }

    Map attributes();

    int end();

    boolean isClosed();

    String name();

    int start();
}
