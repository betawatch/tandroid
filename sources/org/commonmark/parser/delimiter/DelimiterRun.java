package org.commonmark.parser.delimiter;

/* loaded from: classes3.dex */
public interface DelimiterRun {
    boolean canClose();

    boolean canOpen();

    int length();

    int originalLength();
}
