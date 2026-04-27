package org.commonmark.parser;

import java.util.List;
import org.commonmark.node.LinkReferenceDefinition;

/* loaded from: classes3.dex */
public interface InlineParserContext {
    List getCustomDelimiterProcessors();

    LinkReferenceDefinition getLinkReferenceDefinition(String str);
}
